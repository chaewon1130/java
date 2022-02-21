package com.pcwk.exception.ex08.userexception;

import com.pcwk.cmn.LoggerManager;

public class IDFormatExceptionMain implements LoggerManager {
	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException{
		// id == null 예외 발생
		// !(8<= id <= 20) 예외 발생
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용하세요.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDFormatExceptionMain idFormat = new IDFormatExceptionMain();
		String id = "a123456";
		try {
			idFormat.setUserID(id);
		} catch (IDFormatException e) {
			LOG.debug("IDFormatException : " + e.getMessage());
		}
		LOG.debug("프로그램 종료");
	}
}