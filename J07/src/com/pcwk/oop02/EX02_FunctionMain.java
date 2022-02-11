package com.pcwk.oop02;

public class EX02_FunctionMain {

	public static void main(String[] args) {
		int first = 11;
		int second = 13;

		int sum = add(first, second);
		System.out.println(first + " + " + second + " = " + sum);
	}

	/**
	 * 두 수 더하기!
	 * @param num1
	 * @param num2
	 * @return result
	 */
	public static int add(int num1, int num2) {
		int result = 0;

		result = num1 + num2;

		return result;
	}
}