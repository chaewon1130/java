package com.pcwk.time.ex01;

import java.time.LocalDate;

public class WithDateEx02 {
	
	// 각 클래스에 필드 값들을 특정값으로 변경할 수 있는 메소드
	// withXXX(int)
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("today : " + today);
		
		LocalDate newDay = today.withYear(2014)
								.withMonth(5)
								.withDayOfMonth(24);
		System.out.println(newDay);
		
	}
}
//today : 2022-02-24
//2014-05-24