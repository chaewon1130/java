package com.pcwk.util.ex02.date;

import java.util.Calendar;
import java.util.Date;

public class DateEx02 {

	public static void main(String[] args) {
		// Calendar -> Date
		Calendar cal = Calendar.getInstance();
		Date d01 = new Date(cal.getTimeInMillis());
		System.out.println("d01 : " + d01);
		
		// Date -> Calendar
		Date d02 = new Date();
		Calendar cal02 = Calendar.getInstance();
		cal02.setTime(d02);
	}
}