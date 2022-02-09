package com.pcwk.ed02;

public class EX04_For2 {

	public static void main(String[] args) {
		// 1~10까지 누적
		int sum = 0;
		for (int i = 1;; i++) {
			sum += i;
			System.out.println("i : "+i);
			if (i == 10) {
				break;
			}
		}
		System.out.println("1~10 sum : " + sum);
	}
}