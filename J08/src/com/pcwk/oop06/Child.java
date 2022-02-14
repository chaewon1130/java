package com.pcwk.oop06;

public class Child extends Parent {
	int x = 20;

	void method() {
		System.out.println("x : " + x);
		System.out.println("this.x : " + this.x); // Child의 x
		System.out.println("super.x : " + super.x); // Parent의 x
	}
}
