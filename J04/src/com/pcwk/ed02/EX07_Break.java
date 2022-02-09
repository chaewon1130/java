package com.pcwk.ed02;

public class EX07_Break {

	public static void main(String[] args) {
		// break문
		// 반복문에서 break문을 만나면 더 이상 반복을 수행하지 않고
		// 반복문을 빠져나온다.(반복문 1개를 벗어난다)
		
		int sum = 0;
		int i = 0;
		for(i=0;true;i++) {
			sum+=i;
			if(sum >= 100)
				break;
		}
		System.out.println("sum : "+sum);
		System.out.println("i : "+i);
	}
}