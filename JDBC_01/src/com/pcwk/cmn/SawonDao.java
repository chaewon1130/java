package com.pcwk.cmn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class SawonDao implements WorkDiv<SawonVO> {
	
	private Connection connection; // DB연결 정보
	
	public SawonDao() {
		connect();
	}
	
	public void connect() {
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
	}

	// 목록조회
	@Override
	public List<SawonVO> doRetrieve(DTO dto) {
		return null;
	}
	
	// INSERT
	@Override
	public int doSave(SawonVO dto) {
		return 0;
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
