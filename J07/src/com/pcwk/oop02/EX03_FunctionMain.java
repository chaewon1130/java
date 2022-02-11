package com.pcwk.oop02;

public class EX03_FunctionMain {

	public static void main(String[] args) {
		int first = 11;
		int second = 13;

		int sum = add(first, second);
		System.out.println(first + " + " + second + " = " + sum);

		int sub = subtract(first, second);
		System.out.println(first + " - " + second + " = " + sub);

		int mul = multiply(first, second);
		System.out.println(first + " * " + second + " = " + mul);

		double div = divide(first, second);
		System.out.println(first + " / " + second + " = " + div);

	}

	/**
	 * 나누기
	 * 
	 * @param num1
	 * @param num2
	 * @return num1 / num2
	 */
	public static double divide(int num1, int num2) {
		return (double) num1 / num2;
	}

	/**
	 * 곱하기
	 * 
	 * @param num1
	 * @param num2
	 * @return num1*num2
	 */
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	/**
	 * 빼기
	 * 
	 * @param num1
	 * @param num2
	 * @return num1-num2
	 */
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	/**
	 * 더하기
	 * 
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