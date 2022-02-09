package com.pcwk.ed01;

import java.util.Scanner;

public class EX07_Switch06_Quiz {

	public static void main(String[] args) {

		System.out.print("점수를 입력하세요(1~100)>>");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade = ' ';
		char plus = ' ';

		switch (score / 10) {
		case 10:
		case 9:
			if (score >= 95) {
				plus = '+';
			}
			grade = 'A';
			break;
		case 8:
			if (score >= 85) {
				plus = '+';
			}
			grade = 'B';
			break;
		case 7:
			if (score >= 75) {
				plus = '+';
			}
			grade = 'C';
			break;
		case 6:
			if (score >= 65) {
				plus = '+';
			}
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade + plus);
	}
}