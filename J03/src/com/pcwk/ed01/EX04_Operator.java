package com.pcwk.ed01;

public class EX04_Operator {
	public static void main(String[] args) {
		// 단락회로평가(SCE)
		// 논리곱(&&)은 두 항이 모두 true일 때만 결과가 true
		// 앞 항이 false면 뒤항의 결과를 평가하지 않아도 false
		// 논리합(||)은 두 항이 모두 false일 때만 결과가 false
		// 앞 항이 true이면 뒤항의 결과를 평가하지 안하도 true
		int num1 = 10;
		int i = 2;
		// 앞 항이 false이므로 뒤 연산은 수행하지 않음!
		boolean flag = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println("flag = "+flag);
		System.out.println("num1 = "+num1);
		System.out.println("i = "+i);
		
		flag = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println("flag = "+flag);
		System.out.println("num1 = "+num1);
		System.out.println("i = "+i);
		
	}
}