package com.pcwk.oop08;

import java.text.SimpleDateFormat;

import java.util.Date;

// Ctrl + Shift + O
// import문 정리
public class ImportTestMain {

	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");// 년-월-일
		System.out.println("today : " + today);
		System.out.println("오늘날짜 : " + date.format(today));

		SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");// 오전/오후-시-분-초
		System.out.println("현재시간 : " + time.format(today));
		// Local PC 시간 기준
	}
}