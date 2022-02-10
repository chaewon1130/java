package com.pcwk.array01;

import java.util.Arrays;

public class Q05_LotSort {

	public static void main(String[] args) {

		int[] ball = new int[45];

		// 1. 숫자 1~45를 할당
		// 2. shuffle 6개 추출

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		for (int i = 0; i < 1000; i++) {
			int num = (int) (Math.random() * 45);
			int temp = ball[0];
			ball[0] = ball[num];
			ball[num] = temp;
		}
		// 정렬1
//		for(int j=0; j<6; j++) {
//			for(int i=0; i<6; i++) {
//				if(ball[i]> ball[i+1]) {
//					int temp = ball[i];
//					ball[i] = ball[i+1];
//					ball[i+1] = temp;
//				}
//			}
//		}
		// 정렬2
		int[] sortBall = new int[6];
		System.arraycopy(ball, 0, sortBall, 0, sortBall.length);
		for (int i = 1; i < sortBall.length; i++) {
			for (int j = 0; j < sortBall.length - i; j++) {
				if (sortBall[j] > sortBall[j + 1]) {
					int temp = sortBall[j];
					sortBall[j] = sortBall[j + 1];
					sortBall[j + 1] = temp;
				}
			}
		}
		System.out.println("Sort : " + Arrays.toString(sortBall));

//		System.out.print("로또 번호는 : ");
//		for (int i = 0; i < 6; i++) {
//			System.out.print(ball[i] + " ");
//		}
	}
}