/**
* <pre>
* com.pcwk.util.ex01.calendar
* Class Name : CalendarEx02Main.java
* Description:
* Author: ITSC
* Since: 2022/02/22
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/22 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex01.calendar;

import java.util.*;

public class CalendarEx02Main {

	// Calendar 사용

	public static void main(String[] args) {
		// get() 메소드로 정보 가져오기
		Calendar today = Calendar.getInstance();
		// 년도
		int year = today.get(Calendar.YEAR);

		// 월 : 0~11(0:1월)
		int month = today.get(Calendar.MONTH) + 1;

		// 일
		int day = today.get(Calendar.DATE);

		System.out.println("년 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);

		System.out.println("===============");
		System.out.println(year + "년 " + month + "월 " + day + "일");

		// 요일 : 1(일요일)~7(토요일)
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 : " + week);

		// 오전(0), 오후(1)
		System.out.println("오전/오후 : " + today.get(Calendar.AM_PM));
		// 시간(0~11)
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		// 시간(0~23)
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		// 분(0~59)
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		// 초
		System.out.println("초 : " + today.get(Calendar.SECOND));
		// 1000분의 1초(ms)
		System.out.println("초(ms) : " + today.get(Calendar.MILLISECOND));

		System.out.println(today.get(Calendar.HOUR_OF_DAY) + ":" + today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND));
	}
}
//년 : 2022
//월 : 2
//일 : 22
//===============
//2022년 2월 22일
//요일 : 3
//오전/오후 : 0
//시간(0~11) : 10
//시간(0~23) : 10
//분 : 25
//초 : 30
//초(ms) : 610
//10:25:30
