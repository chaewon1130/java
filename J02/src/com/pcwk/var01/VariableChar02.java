package com.pcwk.var01;

public class VariableChar02 {
	/*
	 컴퓨터에서는 문자도 내부적으로 비트의 조합으로 표현
	 자바에서는 문자를 2바이트로 처리
	 
	 인코딩 - 각 문자에 따른 특정한 숫자값(코드값)을 부여
	 디코딩 - 숫자값(코드값)을 원래의 문자로 변환
	*/
	public static void main(String[] args) {
		char ch01 = 'A';
		System.out.println("ch01 = "+ch01);
		// 'A'에 해당하는 ASCII코드 값
		System.out.println((int)ch01); // 65
		
		char ch02 = 66; // 문자에 정수 값 대입
		System.out.println("ch02 = "+ch02);
		
		int ch03 = 67;
		System.out.println("ch03 = "+ch03);
		System.out.println((char)ch03);
	}
}