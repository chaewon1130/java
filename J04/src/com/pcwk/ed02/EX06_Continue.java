package com.pcwk.ed02;

public class EX06_Continue {

	public static void main(String[] args) {
		int total = 0;
		
		// continue 만나면 for에 증감식으로 간다.	
		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				continue;
			}
			System.out.println(num);
			total += num;
		}
		System.out.println("1~100까지의 홀수 합 : " + total);
	}
}