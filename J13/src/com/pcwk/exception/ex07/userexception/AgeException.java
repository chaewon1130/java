package com.pcwk.exception.ex07.userexception;

// 사용자 정의 Exception
public class AgeException extends Exception {

	public AgeException() {

	}

	public AgeException(String message) {
		super(message);
	}
}
