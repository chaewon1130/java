package com.pcwk.array01;

public class Q01_MaxMin {

	public static void main(String[] args) {
		// 최댓값과 최솟값 구하기
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		int max = score[0];
		int min = score[0];
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		System.out.println("===========");
		
		int[] test = { 79, 88, 91, 33, 100, 55, 95 };
		int temp = 0;
		
		for(int j=1; j<test.length-1; j++) {
			for(int i=0; i<test.length-1; i++) {
				if(test[i] > test[i+1]) {
					temp = test[i+1];
					test[i+1] = test[i];
					test[i] = temp;
				}
			}
		}
		System.out.println("Max : " + test[test.length-1]);
		System.out.println("Min : " + test[0]);
	}
}