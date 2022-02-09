package com.pcwk.ed01;

import java.util.Scanner;

public class EX06_Switch05_Quiz {

	public static void main(String[] args) {

		System.out.print("점수를 입력하세요(1~100)>>");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade = ' ';

		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);
	}
}