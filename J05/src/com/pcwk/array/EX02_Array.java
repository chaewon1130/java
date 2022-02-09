package com.pcwk.array;

public class EX02_Array {

	public static void main(String[] args) {
		int score01[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		System.out.println("score01.length : " + score01.length);

		for (int i = 0; i < score01.length; i++) {
			sum += score01[i];
			System.out.println(score01[i]);
		}
		System.out.println("sum : " + sum);
	}
}