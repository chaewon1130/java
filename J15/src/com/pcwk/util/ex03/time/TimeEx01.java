package com.pcwk.util.ex03.time;

import java.time.*;

public class TimeEx01 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // 날짜
		System.out.println("today : " + today.toString());

		LocalTime time = LocalTime.now(); // 시간
		System.out.println("time : " + time.toString());
		
		LocalDate localD = today.minusYears(2) // 2년빼기
								.plusMonths(3) // 3개월더하기
								.minusDays(3)  // 3일빼기
								;
		System.out.println("localD : " + localD);
		
		// 주 더하기
		LocalDate localD02 = today.plusWeeks(1);
		System.out.println("localD02 : " + localD02);

	}
}