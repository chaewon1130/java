package com.pcwk.exception.ex07.userexception;

import com.pcwk.cmn.LoggerManager;

public class UserExceptionMain implements LoggerManager {

	public static void ticketing(int age) throws AgeException{
		if(age < 0) {
			LOG.debug("ticketing() : " + age);
			throw new AgeException("나이를 확인 하세요.\n나이는 0이상이어야 함");
		}
	}

	public static void main(String[] args) {
		try {
			ticketing(-9);
		} catch (AgeException e) {
			LOG.debug("main AgeException");
			LOG.debug("getMessage : " + e.getMessage());
//			e.printStackTrace();
		}
	}
}
// ticketing() : -9
// main AgeException
// getMessage : 나이를 확인 하세요.
// 나이는 0이상이어야 함
