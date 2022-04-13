package com.pcwk.cmn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class SawonDao implements WorkDiv<SawonVO> {
	final Logger LOG = Logger.getLogger(this.getClass());
	
	private PConnection pConnection;
	public SawonDao() {
		pConnection = new PConnection();
	}
	
	/**
	 * 총 개수
	 * @param dto
	 * @return
	 */
	public int totalCount(DTO dto) {
		int totalCnt = 0;
		SearchVO inVO = (SearchVO) dto;
		
		// =======================================
		// JDBC연결
		// 1. JDBC DRIVER LOADING
		// 2. CONNECTION 생성
		// 3. PreparedStatement 생성
		// 4. 쿼리실행
		// 5. 쿼리 실행 결과 처리
		// 6. 자원 반납(CLOSE)
		// ResultSet, PreparedStatement, Connection
		// ========================================
		
		Connection conn = null; // DB연결 정보
		PreparedStatement pstmt = null; // SQL + 데이터
		ResultSet rs = null; // DB에서 전달된 정보 추출
		StringBuilder sb = new StringBuilder(50);
		
		// 검색조건 처리
		StringBuilder sbWhere  = new StringBuilder(50);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		// 검색조건 : searchDiv(검색조건), searchWord(검색어)
		// "" : 전체
		// 10 : 사번
		// 20 : 이름
		// 30 : 부서번호
		if(inVO != null) {
			if(inVO.getSearchDiv().equals("30")) {
				sbWhere.append("WHERE deptno LIKE ? || '%'");
			}else if(inVO.getSearchDiv().equals("20")){
				sbWhere.append("WHERE ename LIKE ? || '%'");
			}else if(inVO.getSearchDiv().equals("10")) {
				sbWhere.append("WHERE empno LIKE ? || '%'");
			}
		}
		
		// 2. SQL 작성
		sb.append(" SELECT COUNT(*) totalCnt \n");
		sb.append(" FROM SAWON               \n");
		// 조건절
		sb.append(sbWhere.toString());
		
		LOG.debug("query : \n " + sb.toString());
		LOG.debug("param : " + inVO.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			
			if(inVO != null && !inVO.getSearchDiv().equals("")) {
				pstmt.setString(1, inVO.getSearchWord());
			}
			
			// 4. SQL실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				totalCnt = rs.getInt("totalCnt");
			}
			
			LOG.debug("totalCnt : " + totalCnt);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// rs 자원반납
	    	JDBCUtil.close(rs);
	    	
	    	// pstmt 자원반납
	    	JDBCUtil.close(pstmt);
	    	
	    	// conn 자원반납
	    	JDBCUtil.close(conn);			
		}
		
		return totalCnt;
	}
	
	
	/**
	 * 등록 / 수정
	 * @param dto
	 * @return 1(성공) / 0(실패)
	 */
	public int upsert(SawonVO dto) {
		int flag = 0;
		
		Connection conn = null; // DB 연결정보
		PreparedStatement pstmt = null; // SQL + 데이터
		StringBuilder sb = new StringBuilder(100);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		sb.append("MERGE INTO sawon ta                                    \n");
		sb.append("USING (                                                \n");
		sb.append("    SELECT ? AS empno,                                 \n");
		sb.append("        ? AS ename,                                    \n");
		sb.append("        SYSDATE AS hiredate,                           \n");
		sb.append("        ? AS deptno                                    \n");
		sb.append("    FROM dual                                          \n");
		sb.append(") tb                                                   \n");
		sb.append("ON(ta.empno = tb.empno)                                \n");
		sb.append("WHEN MATCHED THEN                                      \n");
		sb.append("    UPDATE SET ta.ename = tb.ename,                    \n");
		sb.append("                ta.hiredate = tb.hiredate,             \n");
		sb.append("                ta.deptno = tb.deptno                  \n");
		sb.append("WHEN NOT MATCHED THEN                                  \n");
		sb.append("    INSERT (ta.empno, ta.ename, ta.hiredate, ta.deptno)\n"); 
		sb.append("    VALUES (tb.empno, tb.ename, tb.hiredate, tb.deptno)\n");
		LOG.debug("query : " + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setInt(3, dto.getDeptno());
			
			// 4. SQL 실행
			flag = pstmt.executeUpdate();
			// 5. SQL 실행결과
			LOG.debug("flag : " + flag);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn);
			JDBCUtil.close(pstmt);
		}
		
		
		return flag;
	}

	// 목록조회
	@Override
	public List<SawonVO> doRetrieve(DTO dto) {
		List<SawonVO> sawonList = new ArrayList<SawonVO>();
		SearchVO inVO = (SearchVO)dto;
		
		// =======================================
		// JDBC연결
		// 1. JDBC DRIVER LOADING
		// 2. CONNECTION 생성
		// 3. PreparedStatement 생성
		// 4. 쿼리실행
		// 5. 쿼리 실행 결과 처리
		// 6. 자원 반납(CLOSE)
		// ResultSet, PreparedStatement, Connection
		// ========================================
		
		Connection conn = null; // DB 연결정보
		PreparedStatement pstmt = null; // SQL + 데이터
		ResultSet rs = null; // DB에서 전달된 정보 추출
		StringBuilder sb = new StringBuilder(300);
		// 검색 조건 처리
		StringBuilder sbWhere = new StringBuilder(100);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		// 검색조건 : searchDiv(검색조건), searchWord(검색어)
		// "" : 전체
		// 10 : 사번
		// 20 : 이름
		// 30 : 부서번호
		if(inVO != null) {
			if(inVO.getSearchDiv().equals("30")) {
				sbWhere.append("WHERE deptno LIKE ? || '%'");
			}else if(inVO.getSearchDiv().equals("20")){
				sbWhere.append("WHERE ename LIKE ? || '%'");
			}else if(inVO.getSearchDiv().equals("10")) {
				sbWhere.append("WHERE empno LIKE ? || '%'");
			}
		}
		
		// 2. SQL작성
		sb.append("SELECT tt1.rnum as num,                                          \n");
		sb.append("    tt1.empno,                                                   \n");
		sb.append("    tt1.ename,                                                   \n");
		sb.append("    TO_CHAR(tt1.hiredate, 'YYYY/MM/DD') AS hiredate,             \n");
		sb.append("    tt1.deptno                                                   \n");
		sb.append("FROM(                                                            \n");
		sb.append("    SELECT ROWNUM AS rnum, t1.*                                  \n");
		sb.append("    FROM(                                                        \n");
		sb.append("        SELECT *                                                 \n");
		sb.append("        FROM SAWON                                               \n");
		// 조건절
		sb.append(sbWhere.toString());
		sb.append("        --조건                                                    \n");
		sb.append("        ORDER BY HIREDATE DESC                                   \n");
		sb.append("    )t1                                                          \n");
//		sb.append("    --WHERE ROWNUM <= (&PAGE_SIZE * (&PAGE_NUM - 1) + &PAGE_SIZE)\n");
		sb.append("    WHERE ROWNUM <= (? * (? - 1) + ?)							\n");
//		sb.append("	--WHERE ROWNUM <= 10                                              \n");
		sb.append(")tt1                                                             \n");
//		sb.append("--WHERE rnum >= (&PAGE_SIZE * (&PAGE_NUM - 1) + 1)               \n");
		sb.append("WHERE rnum >= (? * (? - 1) + 1)              					 \n");
//		sb.append("WHERE rnum >= 1                                                  \n");
		
		LOG.debug("query : \n" + sb.toString());
		LOG.debug("param : " + inVO.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			
			if(inVO != null && !inVO.getSearchDiv().equals("")) { // 검색조건이 있으면
				pstmt.setString(1, inVO.getSearchWord());
				
				pstmt.setInt(2, inVO.getPageSize());
				pstmt.setInt(3, inVO.getPageNum());
				pstmt.setInt(4, inVO.getPageSize());
				
				pstmt.setInt(5, inVO.getPageSize());
				pstmt.setInt(6, inVO.getPageNum());
			}else { // 전체(검색조건 전체)
				pstmt.setInt(1, inVO.getPageSize());
				pstmt.setInt(2, inVO.getPageNum());
				pstmt.setInt(3, inVO.getPageSize());
				
				pstmt.setInt(4, inVO.getPageSize());
				pstmt.setInt(5, inVO.getPageNum());
			}
			
			// 4. SQL실행 : ResultSet
			rs = pstmt.executeQuery();
			
			// 5. return 받은 ResultSet에서 데이터 추출
			while(rs.next()) {
				SawonVO outVO = new SawonVO();
				outVO.setNo(rs.getInt("num"));
				outVO.setEmpno(rs.getInt("empno"));
				outVO.setEname(rs.getString("ename"));
				outVO.setHiredate(rs.getString("hiredate"));
				outVO.setDeptno(rs.getInt("deptno"));
				
				
				sawonList.add(outVO);
			}
			
		}catch(SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// rs 자원반납
	    	JDBCUtil.close(rs);
	    	
	    	// pstmt 자원반납
	    	JDBCUtil.close(pstmt);
	    	
	    	// conn 자원반납
	    	JDBCUtil.close(conn);
		}
		
		return sawonList;
	}
	
	// INSERT
	@Override
	public int doSave(SawonVO dto) {
		int flag = 0;
		Connection conn = null; // DB 연결정보
		PreparedStatement pstmt = null; // SQL + DATA 담기
		StringBuilder sb = new StringBuilder(200);
		
		// 1. DB 연결
		conn = pConnection.connect();
		
		// 2. SQL 작성
		// \n은 그냥 쿼리 보이게하기위해 넣은거임
		sb.append(" INSERT INTO sawon (  \n");
		sb.append("     empno,           \n");
		sb.append("     ename,           \n");
		sb.append("     hiredate,        \n");
		sb.append("     deptno           \n");
		sb.append(" ) VALUES (           \n");
		sb.append("     ?,               \n");
		sb.append("     ?,               \n");
		sb.append("     SYSDATE,         \n");
		sb.append("     ?                \n");
		sb.append(" )                    \n");
		
		LOG.debug(sb.toString());
		LOG.debug("param : " + dto.toString());
		
		// 3. param 전달
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getEmpno()); // ? 첫번째에 int(사번)값을 넣어주겠다
			pstmt.setString(2, dto.getEname()); // ? 두번째에 string(이름)값을 넣어주겠다
			pstmt.setInt(3, dto.getDeptno()); // ? 세번째에 int(부서번호)값을 넣어주겠다
		
			// 4. SQL 실행
			flag = pstmt.executeUpdate();
			
			// 5. SQL 실행결과
			LOG.debug("flag : " + flag);
		} catch (SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		// 6. 자원반납
		} finally {
			// pstmt 자원반납
			JDBCUtil.close(pstmt);
			
			// conn 자원반납
			JDBCUtil.close(conn);
		}
		return flag;
	}
	
	// DELETE
	@Override
	public int doDelete(SawonVO dto) {
		int flag = 0;
		Connection conn = null; // DB연결 정보
		PreparedStatement pstmt = null; // SQL + DATA
		StringBuilder sb = new StringBuilder(200);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		// 2. SQL작성
		sb.append("DELETE FROM sawon \n");
		sb.append("WHERE empno = ? \n");
		LOG.debug("Query :\n" + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		// 3. PARAM전달
		try {
//			conn.setAutoCommit(true); // 트랜잭션 자동 commit
			
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getEmpno());
			// 4. SQL 실행
			flag = pstmt.executeUpdate();
			// 5. SQL 실행결과
			LOG.debug("flag : " + flag);
			
//			if(flag == 1) {
//				conn.commit();
//			}else {
//				conn.rollback();
//			}
			
		}catch(SQLException e) {
//			conn.rollback();
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// pstmt 자원반납
			JDBCUtil.close(pstmt);
			// conn 자원반납
			JDBCUtil.close(conn);
		}
		
		return flag;
	}
	
	// SELECT
	@Override
	public SawonVO doSelectOne(SawonVO dto) {
		SawonVO outVO = null; // return
		
		Connection conn = null; // DB연결 정보
		PreparedStatement pstmt = null; // SQL + 데이터
		ResultSet rs = null; // DB에서 전달된 정보 추출
		StringBuilder sb = new StringBuilder(50);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		// 2. SQL작성                                                            
		sb.append(" SELECT empno,                                           \n");
	    sb.append(" 	ename,                                              \n");
	    sb.append(" 	TO_CHAR(hiredate, 'YYYY/MM/DD HH24:MI:SS') hiredate,\n");
	    sb.append(" 	deptno		                                        \n");
	    sb.append(" FROM sawon                                              \n");
	    sb.append(" WHERE empno = ?                                         \n");
	    
	    LOG.debug("query : \n" + sb.toString());
	    LOG.debug("param : " + dto.toString());
	    
	    // 3. param 전달
	    try {
	    	pstmt = conn.prepareStatement(sb.toString());
	    	pstmt.setInt(1, dto.getEmpno());
	    	
	    	// 4. SQL 실행 : ResultSet
	    	rs = pstmt.executeQuery();
	    	
	    	// 5. return 받은 ResultSet에서 DB에서 전달된 데이터 추출
	    	if(rs.next()) {
	    		outVO = new SawonVO();
	    		outVO.setEmpno(rs.getInt("empno"));
	    		outVO.setEname(rs.getString("ename"));
	    		outVO.setHiredate(rs.getString("hiredate"));
	    		outVO.setDeptno(rs.getInt("deptno"));
	    	}
	    	
	    	LOG.debug("outVO : " + outVO);
	    	
	    	
	    }catch(SQLException e) {
	    	LOG.debug("SQLException : " + e.getMessage());
	    	e.printStackTrace();
	    }finally {
	    	// rs 자원반납
	    	JDBCUtil.close(rs);
	    	
	    	// pstmt 자원반납
	    	JDBCUtil.close(pstmt);
	    	
	    	// conn 자원반납
	    	JDBCUtil.close(conn);
	    }
		
		return outVO;
	}

	// UPDATE
	@Override
	public int doUpdate(SawonVO dto) {
		int flag = 0;
		
		Connection conn = null; // DB연결 정보
		PreparedStatement pstmt = null; // SQL + 데이터
		StringBuilder sb = new StringBuilder(100);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		// 2. SQL 작성
		sb.append("UPDATE sawon               \n");
		sb.append("   SET ename = ?,          \n");
		sb.append("       hiredate = SYSDATE, \n");
		sb.append("       deptno = ?          \n");
		sb.append("WHERE empno = ?            \n");
		
		LOG.debug("query : \n" + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getEname());
			pstmt.setInt(2, dto.getDeptno());
			pstmt.setInt(3, dto.getEmpno());
			
			// 4. SQL실행
			flag = pstmt.executeUpdate();
			
			// 5. SQL 실행결과
			LOG.debug("flag : " + flag);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// pstmt 자원반납
			JDBCUtil.close(pstmt);
			// conn 자원반납
			JDBCUtil.close(conn);
		}
		
		return flag;
	}

}
