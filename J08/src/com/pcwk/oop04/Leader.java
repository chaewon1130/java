package com.pcwk.oop04;

public class Leader extends Student{
	public Leader() {
		System.out.println("Leader()의 생성자");
	}
	void lead() {
		System.out.println("리드 한다");
	}
	
	// 오버라이딩
	@Override
	public void say() {
		System.out.println("선생님께 인사!");
	}
}
