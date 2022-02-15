package com.pcwk.oop01;

public class MyDateMain {

	public static void main(String[] args) {
		MyDate myDate = new MyDate();
		myDate.year = 2018;
		myDate.month = 2;
//		myDate.day = 31;
		// 2월에 일수는 31일이 될 수 없다!
		myDate.setDay(31);
	}
}