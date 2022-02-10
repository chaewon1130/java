package com.pcwk.array01;

import java.util.Arrays;

public class Q02_Shuffle {

	public static void main(String[] args) {
		// 섞기(shuffle)
		// 배열의 요소 순서를 반복해서 바꾼다(카드게임, 로또)
		int[] numArr = new int[10];
		// 1,2,3,4,5,6,7,8,9,0
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 10);
			int temp = numArr[0];
			numArr[0] = numArr[num];
			numArr[num] = temp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}