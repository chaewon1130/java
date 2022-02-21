/**
* <pre>
* com.pcwk.exception.ex06.throws9
* Class Name : ThrowsMain.java
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
package com.pcwk.exception.ex06.throws9;

import com.pcwk.cmn.LoggerManager;

public class ThrowsMain implements LoggerManager{

//	예외던지기(throws)
//	예외 던지기란 예외가 발생했을 경우 현재 메소드가 예외를 처리하지 않고,
//	자신을 호출할 쪽으로 예외 처리에 대한 책임을 넘기는 것.
	public static void methodA() throws Exception{
		LOG.debug("methodA()");
		Exception e = new Exception("메소드A 예외 발생!");
		throw e;
	}
	// 예외 던지기 : 예외 회피
	public static void main(String[] args) throws Exception {
		methodA();
	}
}

//2022-02-21 11:20:44,022 DEBUG [main] cmn.LoggerManager (ThrowsMain.java:27)     - methodA()
//Exception in thread "main" java.lang.Exception: 메소드A 예외 발생!
//	at com.pcwk.exception.ex06.throws9.ThrowsMain.methodA(ThrowsMain.java:28)
//	at com.pcwk.exception.ex06.throws9.ThrowsMain.main(ThrowsMain.java:32)
