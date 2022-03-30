package com.pcwk.cmn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		return 0;
	}
	
	// SELECT
	@Override
	public SawonVO doSelectOne(SawonVO dto) {
		return null;
	}

	// UPDATE
	@Override
	public int doUpdate(SawonVO dto) {
		return 0;
	}

}
