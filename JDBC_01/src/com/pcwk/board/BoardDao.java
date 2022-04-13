package com.pcwk.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.pcwk.cmn.DTO;
import com.pcwk.cmn.JDBCUtil;
import com.pcwk.cmn.PConnection;
import com.pcwk.cmn.SearchVO;
import com.pcwk.cmn.WorkDiv;

public class BoardDao implements WorkDiv<BoardVO> {
	final Logger LOG = Logger.getLogger(getClass());
	
	private PConnection pConnection;
	
	public BoardDao() {
		pConnection = new PConnection();
	}
	
	// 조회count 증가
	public int updateReadCnt(BoardVO dto) {
		int flag = 0;
		
		Connection conn = null; // DB연결 정보
		PreparedStatement pstmt = null; // SQL + 데이터
		StringBuilder sb = new StringBuilder(100);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		sb.append(" UPDATE BOARD                \n");
		sb.append(" SET READ_CNT = READ_CNT + 1 \n");
		sb.append(" WHERE SEQ = ?               \n");
		
		LOG.debug("query : \n" + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getSeq());
			
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
	
	@Override
	public List<BoardVO> doRetrieve(DTO dto) {
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		SearchVO inVO = (SearchVO)dto;
		
		Connection conn = null; // DB 연결정보
		PreparedStatement pstmt = null; // SQL + 데이터
		ResultSet rs = null; // DB에서 전달된 정보 추출
		StringBuilder sb = new StringBuilder(300);
		// 검색 조건 처리
		StringBuilder sbWhere = new StringBuilder(100);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		if(inVO != null) {
			if(inVO.getSearchDiv().equals("30")) {
				sbWhere.append("WHERE contents LIKE ? || '%'");
			}else if(inVO.getSearchDiv().equals("20")){
				sbWhere.append("WHERE title LIKE ? || '%'");
			}else if(inVO.getSearchDiv().equals("10")) {
				sbWhere.append("WHERE seq LIKE ? || '%'");
			}
		}
		
		sb.append(" SELECT A.SEQ,                                     \n");
		sb.append("        A.RNUM AS NUM,                             \n");
		sb.append("        A.TITLE,                                   \n");
		sb.append("        A.READ_CNT,                                \n");
		sb.append("        TO_CHAR(A.MOD_DT, 'YYYY/MM/DD') AS MOD_DT, \n");
		sb.append("        A.MOD_ID                                   \n");
		sb.append(" FROM(                                             \n");
		sb.append("     SELECT ROWNUM AS RNUM, T1.*                   \n");
		sb.append("     FROM (                                        \n");
		sb.append("         SELECT *                                  \n");
		sb.append("         FROM BOARD                                \n");
		// 조건절
		sb.append(sbWhere.toString());
		sb.append("         ORDER BY MOD_DT DESC                      \n");
		sb.append("     )T1                                           \n");
//		sb.append("     WHERE ROWNUM <= 10                            \n");
		sb.append("     WHERE ROWNUM <= (? * (? - 1) + ?)             \n");
		sb.append(" )A                                                \n");
//		sb.append(" WHERE RNUM >= 1                                   \n");
		sb.append(" WHERE RNUM >= (? * (? - 1) + 1)                   \n");
		
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
				BoardVO outVO = new BoardVO();
				outVO.setSeq(rs.getInt("SEQ"));
				outVO.setTitle(rs.getString("TITLE"));
				outVO.setReadCnt(rs.getInt("READ_CNT"));
				outVO.setModDt(rs.getString("MOD_DT"));
				outVO.setModId(rs.getString("MOD_ID"));
				
				boardList.add(outVO);
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
		
		
		
		
		return boardList;
	}

	@Override
	public int doSave(BoardVO dto) {
		int flag = 0;
		Connection conn = null; // DB연결 정보
		PreparedStatement pstmt = null; // SQL+DATA
		StringBuilder sb = new StringBuilder(100);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		// 2. SQL작성
		sb.append(" INSERT INTO board ( \n");
		sb.append("     seq,            \n");
		sb.append("     title,          \n");
		sb.append("     contents,       \n");
		sb.append("     read_cnt,       \n");
		sb.append("     reg_id,         \n");
		sb.append("     mod_id          \n");
		sb.append(" ) VALUES (          \n");
		sb.append("     ?,              \n");
		sb.append("     ?,              \n");
		sb.append("     ?,              \n");
		sb.append("     ?,              \n");
		sb.append("     ?,              \n");
		sb.append("     ?               \n");
		sb.append(" )                   \n");
		
		LOG.debug("query : \n" + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		// 3. param전달
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getSeq());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContents());
			pstmt.setInt(4, 0);
			pstmt.setString(5, dto.getRegId());
			pstmt.setString(6, dto.getModId());
			
			// 4. SQL 실행
			flag = pstmt.executeUpdate();
			
			// 5. SQL 실행결과
			LOG.debug("flag : " + flag);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// 6. 자원반납
			JDBCUtil.close(pstmt);
			JDBCUtil.close(conn);
		}
		return flag;
	}

	@Override
	public int doDelete(BoardVO dto) {
		int flag = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sb = new StringBuilder(200);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		// 2. SQL작성
		sb.append(" DELETE FROM BOARD \n");
		sb.append(" WHERE SEQ = ?     \n");
		
		LOG.debug("query : \n" + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getSeq());
			
			// 4. SQL 실행
			flag = pstmt.executeUpdate();
			
			LOG.debug("flag : " + flag);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// 자원반납
			JDBCUtil.close(pstmt);
			JDBCUtil.close(conn);
		}
		
		
		return flag;
	}

	@Override
	public BoardVO doSelectOne(BoardVO dto) {
		BoardVO outVO = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuilder sb = new StringBuilder(50);
		
		conn = pConnection.connect();
		
		sb.append(" SELECT  seq,                                                \n");
		sb.append("         title,                                              \n");
		sb.append("         contents,                                           \n");
		sb.append("         read_cnt,                                           \n");
		sb.append("         TO_CHAR(reg_dt, 'YYYY/MM/DD HH24:MI:SS') AS REG_DT, \n");
		sb.append("         reg_id,                                             \n");
		sb.append("         TO_CHAR(mod_dt, 'YYYY/MM/DD HH24:MI:SS') AS MOD_DT, \n");
		sb.append("         mod_id                                              \n");
		sb.append(" FROM board                                                  \n");
		sb.append(" WHERE seq = ?                                               \n");
		
		LOG.debug("query : \n" + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getSeq());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				outVO = new BoardVO();
				outVO.setSeq(rs.getInt("seq"));
				outVO.setTitle(rs.getString("title"));
				outVO.setContents(rs.getString("contents"));
				outVO.setReadCnt(rs.getInt("read_cnt"));
				outVO.setRegDt(rs.getString("REG_DT"));
				outVO.setRegId(rs.getString("reg_id"));
				outVO.setModDt(rs.getString("MOD_DT"));
				outVO.setModId(rs.getString("mod_id"));
			}
			
			LOG.debug("outVO : " + outVO);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(rs);
		}
		
		return outVO;
	}

	@Override
	public int doUpdate(BoardVO dto) {
		int flag = 0;
		
		Connection conn = null; // DB연결 정보
		PreparedStatement pstmt = null; // SQL + 데이터
		StringBuilder sb = new StringBuilder(100);
		
		// 1. DB연결
		conn = pConnection.connect();
		
		sb.append(" UPDATE BOARD          \n");
		sb.append(" SET title = ?         \n");
		sb.append("     ,contents = ?     \n");
		sb.append("     ,mod_dt = SYSDATE \n");
		sb.append("     ,mod_id = ?       \n");
		sb.append(" WHERE SEQ = ?         \n");
		
		LOG.debug("query : \n" + sb.toString());
		LOG.debug("param : " + dto.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContents());
			pstmt.setString(3, dto.getModId());
			pstmt.setInt(4, dto.getSeq());
			
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
