package com.pcwk.ed01;

public class EX01_Operator {
	// 등가 비교 연산자, ==, !=
	// 문자열의 비교 equals()
	public static void main(String[] args) {
		double a = 3.14;
		double b = 5.14;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		
		String c01 = "Hello JAVA";
		// 문자열의 비교 : 대소문자 구분
		System.out.println(c01.equals("Hello JAVA"));
		System.out.println(c01.equals("Hello java"));
	}
}