package com.pcwk.time.ex01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateGet {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // 현재날짜
		System.out.println("====================");
		System.out.println("today : " + today);
		// 년, 월, 일 : getXXX()
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();

		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("day : " + day);
		System.out.println("====================");

		LocalTime time = LocalTime.now(); // 현재 시간
		System.out.println("time : " + time.toString());
		// 시, 분, 초 : getXXX()
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();

		System.out.println("hour : " + hour);
		System.out.println("minute : " + minute);
		System.out.println("second : " + second);
		
		// zone
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = LocalDate.now().atStartOfDay(zid);
		System.out.println(zdt);
		
		// 현재 시간대의 뉴욕
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyZdt = ZonedDateTime.now().withZoneSameInstant(nyId);
		System.out.println(nyZdt);
	}
}
//====================
//today : 2022-02-24
//year : 2022
//month : 2
//day : 24
//====================
//time : 09:36:21.183
//hour : 9
//minute : 36
//second : 21
//2022-02-24T00:00+09:00[Asia/Seoul]
//2022-02-24T00:00-05:00[America/New_York]