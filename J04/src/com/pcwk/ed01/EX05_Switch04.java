package com.pcwk.ed01;

import java.util.Scanner;

public class EX05_Switch04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String medal = sc.nextLine().toUpperCase();
		System.out.println("메달 : " + medal);

		switch (medal) {
		case "GOLD":
			System.out.println("금메달입니다.");
			break;
		case "SILVER":
			System.out.println("은메달입니다.");
			break;
		case "BRONZE":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("무관입니다.");
			break;
		}
	}
}