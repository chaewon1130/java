/**
* <pre>
* com.pcwk.exception.ex02.finaly
* Class Name : TryCatchFinallyMain.java
* Description: try-catch-finally 실습
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
package com.pcwk.exception.ex04.resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.pcwk.cmn.LoggerManager;

public class TryCatchFinallyMain implements LoggerManager {
	
//	리소스를 자동으로 해제 하도록 제공해주는 구문
//	AutoCloseable 인터페이스를 구현 해야함!
//	close()를 명시적으로 넣을 필요 없음.
//	JVM이 알아서 close() 처리함.
	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("C:\\DCOM_20220127\\01_JAVA\\workspace\\J13\\output.log")) {
			LOG.debug("1");
			// fis = new FileInputStream("a.txt");
			LOG.debug("1-1");
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			LOG.debug("2. FileNotFoundException : " + e.getMessage());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		LOG.debug("프로그램 종료!");
	}
}