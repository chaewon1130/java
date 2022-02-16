package com.pcwk.oop05.inner;

public class A {

	class InstanceInner { // 인스턴스 클래스
		
	}

	static class StaticInner { // 스태틱 클래스

	}
	
	InstanceInner iInner = new InstanceInner();
	StaticInner sInner = new StaticInner();
	
	void instanceMethod() {
		InstanceInner iInner02 = new InstanceInner();
		StaticInner sInner02 = new StaticInner();
	}
	
	static void staticMethod() {
		// 인스턴스 멤버에 접근 불가
//		InstanceInner iInner03 = new InstanceInner();
		StaticInner sInner03 = new StaticInner();
	}
}
