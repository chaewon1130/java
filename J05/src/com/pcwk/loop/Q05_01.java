package com.pcwk.loop;

import java.util.Scanner;

public class Q05_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1, 연산자, num2를 입력하세요");
		int num1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int num2 = sc.nextInt();
		double result = 0;
		
		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 - num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = (double) num1 / num2;
		} else {
			System.out.println("연산자를 확인하세요");
			return;
		}
		System.out.println(num1 + (" ") + op + (" ") + num2 + " = " + result);
	}

}