package com.pcwk.array;

import java.util.Arrays;

public class EX03_Array {

	public static void main(String[] args) {
		// 시험 점수의 평균 구하기
		int[] student = { 100, 95, 90, 88, 93 };
		int sum = 0;

		for (int i = 0; i < student.length; i++) {
			sum += student[i];
		}
		
		// 배열에 있는 내용 출력 하기
		System.out.println(Arrays.toString(student));
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum / student.length);
	}
}