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
package com.pcwk.exception.ex02.finaly;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.pcwk.cmn.LoggerManager;

public class TryCatchFinallyMain implements LoggerManager {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			LOG.debug("1");
			// fis = new FileInputStream("a.txt");
			fis = new FileInputStream("C:\\DCOM_20220127\\01_JAVA\\workspace\\J13\\output.log");
			LOG.debug("1-1");
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			LOG.debug("2. FileNotFoundException : " + e.getMessage());
		} finally {
			LOG.debug("3. finally 무조건 수행!");
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		LOG.debug("프로그램 종료!");
	}
}
//2022-02-21 10:08:13,800 DEBUG [main] cmn.LoggerManager (TryCatchFinallyMain.java:31)     - 1
//2022-02-21 10:08:13,805 DEBUG [main] cmn.LoggerManager (TryCatchFinallyMain.java:34)     - 1-1
//2022-02-21 10:08:13,805 DEBUG [main] cmn.LoggerManager (TryCatchFinallyMain.java:39)     - 3. finally 무조건 수행!
//2022-02-21 10:08:13,805 DEBUG [main] cmn.LoggerManager (TryCatchFinallyMain.java:46)     - 프로그램 종료!
