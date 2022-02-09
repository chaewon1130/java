package com.pcwk.var02.const01;

public class Const01 {
	public static void main(String[] args) {
		/*
		 상수와 리터럴(constant & literal)
		 상수는 변수와 마찬가지로 값을 저장할 수 있는 공간
		 변수와 달리 한번 값을 할당하면 다른 값으로 변경할 수 없다.
		 final 키워드 사용
		*/
		final double PI = 3.14;
		System.out.println("PI : "+PI);
		
//		PI = 3.15; // 에러 발생
	}
}