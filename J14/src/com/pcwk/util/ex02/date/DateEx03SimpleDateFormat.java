package com.pcwk.util.ex02.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx03SimpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf01 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		// MM-dd-yyyy
		SimpleDateFormat sdf02 = new SimpleDateFormat("MM-dd-yyyy");
		
		// yy년 MM월 dd일 E요일
		SimpleDateFormat sdf03 = new SimpleDateFormat("yy년 MM월 dd일 E요일");

		
		Date today = new Date();
		
		System.out.println("yyyy-MM-dd HH:mm:ss.SSS : " + sdf01.format(today));
		System.out.println("MM-dd-yyyy : " + sdf02.format(today));
		System.out.println("yy년 MM월 dd일 E요일 : " + sdf03.format(today));
	}
}
//yyyy-MM-dd HH:mm:ss.SSS : 2022/02/22 12:14:40.884
//MM-dd-yyyy : 02-22-2022
//yy년 MM월 dd일 E요일 : 22년 02월 22일 화요일