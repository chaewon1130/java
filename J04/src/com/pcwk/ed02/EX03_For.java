package com.pcwk.ed02;

public class EX03_For {

	public static void main(String[] args) {
		// 1~10까지 누적
		int i;
		int sum;
		for (i = 1, sum = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10 sum : " + sum);
	}
}