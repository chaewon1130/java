package com.pcwk.oop02;

public class StaticTest02Class {

	void instanceMethod() {
		// 인스턴스 메소드
	}

	static void staticMethod() {
		// static 메소드
	}

	void instanceMethod02() {
		// 인스턴스 메소드
		instanceMethod(); // 다른 인스턴스 메소드 호출 가능
		staticMethod(); // 다른 static 메소드 호출 가능
	}

	static void staticMethod02() {
		// static 메소드
//		instanceMethod(); // 다른 인스턴스 메소드 호출 불가
		staticMethod(); // 다른 static 메소드 호출 가능
	}
}
