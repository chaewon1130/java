package com.pcwk.ed02;

public class EX05_For3 {

	public static void main(String[] args) {
		// 1~10까지 누적
		int sum = 0;
		for (int i = 1, j = 10;; i++, j--) {
			sum += i;
			System.out.println("i : "+i);
			System.out.println("j : "+j);
			if (i == 10) {
				break;
			}
		}
		System.out.println("1~10 sum : " + sum);
	}
}