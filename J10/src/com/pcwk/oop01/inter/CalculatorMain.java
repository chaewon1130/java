package com.pcwk.oop01.inter;

public class CalculatorMain {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;

		Calculator cal = new Calculator();
		System.out.println("add : " + cal.add(num1, num2));
		System.out.println("substract : " + cal.substract(num1, num2));
		System.out.println("times : " + cal.times(num1, num2));
		System.out.println("divide : " + cal.divide(num1, num2));
		
		System.out.println("==================");
		
		// 약한 결합
		Calc cal02 = new Calculator();
		System.out.println("add : " + cal02.add(num1, num2));
		System.out.println("substract : " + cal02.substract(num1, num2));
		System.out.println("times : " + cal02.times(num1, num2));
		System.out.println("divide : " + cal02.divide(num1, num2));
	}
}