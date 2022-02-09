package com.pcwk.ed02;

public class EX05_IF_ELSE {

	public static void main(String[] args) {
		int a = 77;
		int b = 88;

		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("max : " + max);

		System.out.println("========");
		max = (a > b) ? a : b;
		System.out.println("max : " + max);
	}
}