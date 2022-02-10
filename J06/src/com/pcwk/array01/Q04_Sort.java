package com.pcwk.array01;

import java.util.Arrays;

public class Q04_Sort {
	// 버블정렬
	public static void main(String[] args) {
		int[] lotto = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(lotto));

		for (int i = 1; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - i; j++) {
				int temp = 0;
				if (lotto[j] > lotto[j + 1]) {
					temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		System.out.println("===============");

		int[] numArr = { 7, 4, 5, 1, 3 };
		System.out.println(Arrays.toString(numArr));
		for (int i = 0; i < numArr.length - 1; i++) {
			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
			System.out.println(i+1+"번째 바퀴 : " + Arrays.toString(numArr));
		}
		System.out.println("최종 : " + Arrays.toString(numArr));
	}
}