package com.pcwk.loop;

public class Q05_04 {

	public static void main(String[] args) {
		// 구구단 중 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(i<j) {
					break;
				}
				System.out.println(i + " * " + j + " = " + (i * j));
//				if (i >= j) {
//					System.out.println(i + " * " + j + " = " + (i * j));
//				}
			}
			System.out.println();
		}
	}
}