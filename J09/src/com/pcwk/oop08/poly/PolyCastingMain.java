package com.pcwk.oop08.poly;

public class PolyCastingMain {

	public static void main(String[] args) {
		// 형제간의 관계 : 불가
		FireEngine f = new FireEngine();
		Ambulance a = new Ambulance();
//		f = a;
		
		Car car = null;
		FireEngine fe01 = new FireEngine();
		car = fe01;
		// 자손타입 => 조상타입(Up-Casting) : 형변환 생략가능
		car.drive();
//		car.water();
		
		FireEngine fe02 = new FireEngine();
		fe02 = (FireEngine) car;
		// 조상타입 => 자손타입(Down-Casting) : 형변환 생략불가
		fe02.water();
	}
}