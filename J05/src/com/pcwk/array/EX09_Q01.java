package com.pcwk.array;

public class EX09_Q01 {

	public static void main(String[] args) {
		int[] score = { 100, 88, 100, 100, 90 };
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = (double) sum / 5;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}