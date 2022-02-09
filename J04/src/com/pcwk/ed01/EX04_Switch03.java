package com.pcwk.ed01;

import java.util.Scanner;

public class EX04_Switch03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("年을 입력해주세요!");
		int year = sc.nextInt();
		System.out.print("月을 입력해주세요!");
		int month = sc.nextInt();
		int day = 0;

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			// 연도가 4로 나누어 떨어지고 100으로 나누어떨어지지 않으면 윤년
			// 또는 400으로 나누어 떨어지면 윤년
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		default:
			day = 31;
			break;
		}
		System.out.println("年 : " + year);
		System.out.println("月 : " + month);
		System.out.println("日 : " + day);
	}
}