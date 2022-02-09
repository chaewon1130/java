package com.pcwk.loop;

public class Q05_03 {

	public static void main(String[] args) {
		// 구구단 짝수만 출력
		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
				System.out.println();
			}
		}
	}
}