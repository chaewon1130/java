package com.pcwk.oop05.inner;

public class InnerMain {

	public static void main(String[] args) {
		// 인스턴스 클래스의 인스턴스를 생성하려면
		// 외부 클래스 부터 생성
		Outer outer = new Outer();

		Outer.InstanceInner outerInstance = outer.new InstanceInner();
		System.out.println("outerInstance.iv : " + outerInstance.iv);
		
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
		
		// 스태틱 내부 클래스의 인스턴스는 외부클래스를 먼저 생성하지 않아도 된다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv02 : " + si.iv02);
	}
}