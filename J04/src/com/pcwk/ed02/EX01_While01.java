package com.pcwk.ed02;

public class EX01_While01 {

	public static void main(String[] args) {
		int num = 1, sum = 0;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("sum : " + sum);
	}

}
