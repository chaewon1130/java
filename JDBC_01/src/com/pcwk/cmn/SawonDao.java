package com.pcwk.cmn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SawonDao implements WorkDiv<SawonVO> {
	 
	
	public SawonDao() {
		connect();
	}
	
	
	
	public Connection connect() {
		
		Connection connection = null; // DB연결 정보
		
		// jdbc:oracle:thin:@IP:PORT:전역DB명칭
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe"; // URL
		String dbUSER = "scott"; // ID
		String dbPASS = "pcwk"; // PW
		
		
		try {
			// jdbc oracle driver load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// DB 연결
			connection = DriverManager.getConnection(dbURL, dbUSER, dbPASS);
			System.out.println("connection : " + connection);
			
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException : " + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
			e.printStackTrace();
		}
		
		return connection;
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
		conn = connect();
		
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
		System.out.println("query : " + sb.toString());
		System.out.println("param : " + dto.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setInt(3, dto.getDeptno());
			
			// 4. SQL 실행
			flag = pstmt.executeUpdate();
			// 5. SQL 실행결과
			System.out.println("flag : " + flag);
			
		}catch(SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
		}
		
		
		return flag;
	}

	// 목록조회
	@Override
	public List<SawonVO> doRetrieve(DTO dto) {
		return null;
	}
	
	// INSERT
	@Override
	public int doSave(SawonVO dto) {
		int flag = 0;
		Connection conn = null; // DB 연결정보
		PreparedStatement pstmt = null; // SQL + DATA 담기
		StringBuilder sb = new StringBuilder(200);
		
		// 1. DB 연결
		conn = connect();
		
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
		
		System.out.println(sb.toString());
		System.out.println("param : " + dto.toString());
		
		// 3. param 전달
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getEmpno()); // ? 첫번째에 int(사번)값을 넣어주겠다
			pstmt.setString(2, dto.getEname()); // ? 두번째에 string(이름)값을 넣어주겠다
			pstmt.setInt(3, dto.getDeptno()); // ? 세번째에 int(부서번호)값을 넣어주겠다
		
			// 4. SQL 실행
			flag = pstmt.executeUpdate();
			
			// 5. SQL 실행결과
			System.out.println("flag : " + flag);
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
			e.printStackTrace();
		// 6. 자원반납
		} finally {
			// pstmt 자원반납
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			// conn 자원반납
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
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
		conn = connect();
		
		// 2. SQL작성
		sb.append("DELETE FROM sawon \n");
		sb.append("WHERE empno = ? \n");
		System.out.println("Query :\n" + sb.toString());
		System.out.println("param : " + dto.toString());
		
		// 3. PARAM전달
		try {
//			conn.setAutoCommit(true); // 트랜잭션 자동 commit
			
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getEmpno());
			// 4. SQL 실행
			flag = pstmt.executeUpdate();
			// 5. SQL 실행결과
			System.out.println("flag : " + flag);
			
//			if(flag == 1) {
//				conn.commit();
//			}else {
//				conn.rollback();
//			}
			
		}catch(SQLException e) {
//			conn.rollback();
			System.out.println("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// pstmt 자원반납
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			// conn 자원반납
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
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
		conn = connect();
		
		// 2. SQL작성                                                            
		sb.append(" SELECT empno,                                           \n");
	    sb.append(" 	ename,                                              \n");
	    sb.append(" 	TO_CHAR(hiredate, 'YYYY/MM/DD HH24:MI:SS') hiredate,\n");
	    sb.append(" 	deptno		                                        \n");
	    sb.append(" FROM sawon                                              \n");
	    sb.append(" WHERE empno = ?                                         \n");
	    
	    System.out.println("query : \n" + sb.toString());
	    System.out.println("param : " + dto.toString());
	    
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
	    	
	    	System.out.println("outVO : " + outVO);
	    	
	    	
	    }catch(SQLException e) {
	    	System.out.println("SQLException : " + e.getMessage());
	    	e.printStackTrace();
	    }finally {
	    	// rs 자원반납
	    	if(rs != null) {
	    		try {
					rs.close();
				} catch (SQLException e) {
					
				}
	    	}
	    	
	    	// pstmt 자원반납
	    	if(pstmt != null) {
	    		try {
					pstmt.close();
				} catch (SQLException e) {
					
				}
	    	}
	    	
	    	// conn 자원반납
	    	if(conn != null) {
	    		try {
					conn.close();
				} catch (SQLException e) {
					
				}
	    	}
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
		conn = connect();
		
		// 2. SQL 작성
		sb.append("UPDATE sawon               \n");
		sb.append("   SET ename = ?,          \n");
		sb.append("       hiredate = SYSDATE, \n");
		sb.append("       deptno = ?          \n");
		sb.append("WHERE empno = ?            \n");
		
		System.out.println("query : \n" + sb.toString());
		System.out.println("param : " + dto.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getEname());
			pstmt.setInt(2, dto.getDeptno());
			pstmt.setInt(3, dto.getEmpno());
			
			// 4. SQL실행
			flag = pstmt.executeUpdate();
			
			// 5. SQL 실행결과
			System.out.println("flag : " + flag);
			
		}catch(SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// pstmt 자원반납
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			// conn 자원반납
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}			
		}
		
		return flag;
	}

}
