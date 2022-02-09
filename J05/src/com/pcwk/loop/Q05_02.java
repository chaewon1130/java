package com.pcwk.loop;

import java.util.Scanner;

public class Q05_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x, 연산자, y를 입력하세요!");
		int x = sc.nextInt();
		char op = sc.next().charAt(0);
		int y = sc.nextInt();
		double result = 0;
		switch (op) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '*':
			result = x * y;
			break;
		case '/':
			result = (double) x / y;
			break;
		default:
			System.out.println("연산기호를 확인하세요!");
			return;
		}
		if(op == '*')
		System.out.println(x + " " + op + " " + y + " = " + result);
	}
}