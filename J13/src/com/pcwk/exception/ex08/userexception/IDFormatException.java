/**
* <pre>
* com.pcwk.exception.ex08.userexception
* Class Name : IDFormatException.java
* Description:
* Author: ITSC
* Since: 2022/02/21
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/21 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.exception.ex08.userexception;

public class IDFormatException extends Exception {
	
	public IDFormatException() {
		
	}
	public IDFormatException(String message) {
		super(message);
	}
}
