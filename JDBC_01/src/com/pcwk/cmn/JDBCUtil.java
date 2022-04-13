package com.pcwk.cmn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class JDBCUtil {
	final static Logger LOG = Logger.getLogger(JDBCUtil.class);
	
	// ResultSet 자원반납
	public static void close(ResultSet rs) {
		if(rs != null) {
			try {
				LOG.debug("ResultSet 자원반납");
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// PreparedStatement 자원반납
	public static void close(PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
				LOG.debug("PreparedStatement 자원반납");
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Connection 자원반납
	public static void close(Connection conn) {
		if(conn != null) {
			try {
				LOG.debug("Connection 자원반납");
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
