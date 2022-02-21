/**
* <pre>
* com.pcwk.exception.ex05.throw9
* Class Name : ThrowMain.java
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
package com.pcwk.exception.ex05.throw9;

import com.pcwk.cmn.LoggerManager;

public class ThrowMain implements LoggerManager {

	public static void main(String[] args) {
//		프로그래머가 의도적으로 예외를 발생 시키는 행위
//		예외 클래스의 인스턴스를 생성하고 throw를 이용하면 강제 예외 발생
		try {
			LOG.debug("1");
			Exception except = new Exception("예외 발생 시키기(고의)");
			throw except;
//			LOG.debug("2"); // Unreachable Code

		} catch (Exception e) {
			LOG.debug("3. 예외 발생 !");
			LOG.debug("3-1. Exception : " + e.getMessage());
		}
		LOG.debug("프로그램 종료");
	}
}
// 세로편집 : Alt + Shift + A
// 1
// 3. 예외 발생 !
// 3-1. Exception : 예외 발생 시키기(고의)
// 프로그램 종료