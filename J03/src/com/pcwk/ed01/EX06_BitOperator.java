package com.pcwk.ed01;

public class EX06_BitOperator {
	public static void main(String[] args) {
		// 좌 shift
		// 비트를 왼쪽으로 이동
		// 2의 n제곱 곱하기
		int num1 = 5;
		int result = num1 << 2;
		System.out.println("num1 << 2 = "+result);
		
		// 우 shift
		// 비트를 우측으로 이동
		// 2의 n제곱 나누기
		int num2 = 10;
		result = num2 >> 2;
		System.out.println("num2 >> 2 = "+result);
		
		// >>> 부호화 우 shift
		// 비트 이동은 우 shift와 동일, 밀려나간 공간을 부호비트가 아닌 0으로 채움.
		num2 = 10;
		result = num2 >>> 2;
		System.out.println("num2 >>> 2 = "+result);
	}
}