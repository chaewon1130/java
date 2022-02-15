package com.pcwk.oop02;

public class MyDateMain {

	public static void main(String[] args) {
		MyDate myDate = new MyDate(15, 2, 2022);
//		myDate.year = 2018;
//		myDate.month = 2;
//		myDate.day = 31;
		// 2월에 일수는 31일이 될 수 없다!
//		myDate.setYear(-1);
//		myDate.setMonth(2);
//		myDate.setDay(31);
		System.out.println(myDate.toString());
	}
}