package com.pcwk.var01;

public class Variable01 {
	public static void main(String[] args) {
//		int num = 12345678900; // int 범위초과
//		long num = 12345678900; // int 범위초과
		long num = 12345678900l;
		
		System.out.println(num);
		
		/*
		 인코딩 - 각 문자에 따른 특정한 숫자값(코드 값)을 부여
		 디코딩 - 숫자값(코드값)을 원래의 문자로 변환
		 
		 문자 세트 : 코드 값을 모아 둔 것
		 ASCII(American Standard Code for Information Interchange)
		 아스키 : 1바이트로 영문자, 숫자, 특수문자 등을 표현 함
		 유니코드(UNICODE) : 한글과 같은 복잡한 언어를 표현
		 문자를 변수에 저장하면, 문자에 해당하는 코드 값이 저장됨
		 자바는 UTF-16 인코딩을 사용한다
		*/
		char c1 = 126;
		char c2 = '\uAC03';
		System.out.println(c1); // ~
		System.out.println(c2);	// 갃
		
		/*
		 실수 자료형 : float(4바이트), double(8바이트)
		 부동 소수점 방식 : 실수를 지수부와 가수부로 표현, 무한의 실수를 표현하기 위한 방식
		 
		 논리형 : boolean
		 논리값 true / false를 표현하는 자료형
		 
		*/
		
		
	}
}