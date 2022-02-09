package com.pcwk.array;

public class EX01_Array {

	public static void main(String[] args) {
//		배열 초기화 시, 배열의 개수를 명시하지 않음 error
//		int [] studentId = new int[3]{101, 102, 103};

		int[] studentId = { 101, 102, 103 };
		System.out.println("studentId[0] : " + studentId[0]);
		System.out.println("studentId[1] : " + studentId[1]);

		int add = studentId[0] + studentId[1];
		System.out.println("add : " + add);

		System.out.println("배열길이 : " + studentId.length);
		
		// 배열에 있는 모든 값 출력 하기
		for(int i =0; i<studentId.length; i++) {
			System.out.println(studentId[i]);
		}
		System.out.println("=========================");
		
		studentId[0] += 100;
		studentId[1] += 100;
		System.out.println("studentId[0] : " + studentId[0]);
		System.out.println("studentId[1] : " + studentId[1]);
	}
}