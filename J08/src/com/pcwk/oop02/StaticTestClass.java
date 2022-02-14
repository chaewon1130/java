package com.pcwk.oop02;

public class StaticTestClass {
	int iv; // 인스턴스 변수
	static int cv; // 클래스 변수
	
	void instanceMethod() {
		System.out.println(iv); // 인스턴스 변수 사용 가능
		System.out.println(cv); // 클래스 변수 사용 가능
	}
	
	static void staticMethod() {
//		System.out.println(iv); // 인스턴스 변수 사용 불가, 메모리 생성시점이 다름
		System.out.println(cv); // 클래스 변수 사용 가능
		
	}
}