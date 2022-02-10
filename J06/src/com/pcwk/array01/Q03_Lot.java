package com.pcwk.array01;

public class Q03_Lot {

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
		for(int j=0; j<6; j++) {
			for(int i=0; i<6; i++) {
				if(ball[i]> ball[i+1]) {
					int temp = ball[i];
					ball[i] = ball[i+1];
					ball[i+1] = temp;
				}
			}
		}
		System.out.print("로또 번호는 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
	}
}