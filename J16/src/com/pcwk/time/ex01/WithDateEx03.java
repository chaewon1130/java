package com.pcwk.time.ex01;

import java.time.*;

public class WithDateEx03 {
	// 윤년 : 1988 ~ 2030까지 윤년 구하기
	public static void main(String[] args) {
		LocalDate localD = LocalDate.now();
		
		LocalDate newDate = null;
		
		int cnt = 0; // 윤달 건수
		
		for(int i = 1988; i<=2030; i++) {
			newDate = localD.withYear(i); // 1988
			
			if(newDate.isLeapYear()) {
				System.out.println(i+"년은 윤년입니다.");
				cnt++;
			}
		}
		System.out.println("윤년 수 : " + cnt);
	}
}
//1988년은 윤년입니다.
//1992년은 윤년입니다.
//1996년은 윤년입니다.
//2000년은 윤년입니다.
//2004년은 윤년입니다.
//2008년은 윤년입니다.
//2012년은 윤년입니다.
//2016년은 윤년입니다.
//2020년은 윤년입니다.
//2024년은 윤년입니다.
//2028년은 윤년입니다.
//윤년 수 : 11
