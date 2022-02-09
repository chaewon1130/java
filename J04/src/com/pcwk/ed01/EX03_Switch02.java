package com.pcwk.ed01;
import java.util.Scanner;
public class EX03_Switch02 {

	public static void main(String[] args) {

		System.out.print("月을 입력해주세요!");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = 0;
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 31;
			break;
		}
		System.out.println("月 : " + month);
		System.out.println("日 : " + day);
	}
}