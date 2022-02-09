package com.pcwk.ed01;

public class EX03_BitOperator {
	public static void main(String[] args) {
//		0 0 0 0 0 1 0 1
//	&	0 0 0 0 1 0 1 0
//		===============
//		0 0 0 0 0 0 0 0
		
		int num1 = 5;
		int num2 = 10;
		
		int result = num1 & num2;
		System.out.println("num1 & num2 = "+result);
		
//		0 0 0 0 0 1 0 1
//	|	0 0 0 0 1 0 1 0
//		===============
//		0 0 0 0 1 1 1 1
		
		result = num1 | num2;
		System.out.println("num1 | num2 = "+result);
		
//		0 0 0 0 0 1 0 1
//	^	0 0 0 0 1 0 1 0
//		===============
//		0 0 0 0 1 1 1 1
		
		result = num1 ^ num2;
		System.out.println("num1 ^ num2 = "+result);
	}
}