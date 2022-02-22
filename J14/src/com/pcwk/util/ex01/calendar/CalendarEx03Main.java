package com.pcwk.util.ex01.calendar;

import java.util.Calendar;

public class CalendarEx03Main {

	public static void main(String[] args) {
		// 요일 배열(1(일요일) ~ 7)
		final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

		Calendar data01 = Calendar.getInstance(); // 금일
		Calendar data02 = Calendar.getInstance(); // 변경일

		// 2022년
		// 6 월 == 7월(월은 +1해줘야 함)
		// 12일
		// 수료일
		data02.set(2022, 6, 12);
		System.out.println("data02 : " + toString(data02) + "\n요일 : " + DAY_OF_WEEK[data02.get(Calendar.DAY_OF_WEEK)]);

		// 금일
		System.out.println("data01 : " + toString(data01) + "\n요일 : " + DAY_OF_WEEK[data01.get(Calendar.DAY_OF_WEEK)]);

		// 두 날짜간의 차이 : 단위 통일
		// 초 단위 차이
		long difference = (data02.getTimeInMillis() - data01.getTimeInMillis())/1000;
		System.out.println("오늘부터 수료일까지 : " + difference + "초가 남았습니다.");
		
		// 60초, 60분, 24시간 => 하루
		// 일로 변경(60*60*24)
		System.out.println("오늘부터 수료일까지 : " + (difference/(60*60*24)) + "일이 남았습니다.");
	}

	// 년월일
	public static String toString(Calendar today) {

		return today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH) + 1) + "월 " + today.get(Calendar.DATE)
				+ "일";
	}
	
//	data02 : 2022년 7월 12일
//	요일 : 화
//	data01 : 2022년 2월 22일
//	요일 : 화
//	오늘부터 수료일까지 : 12096000초가 남았습니다.
//	오늘부터 수료일까지 : 140일이 남았습니다.

}