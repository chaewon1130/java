package com.pcwk.ed02;

public class EX01_IF {
	public static void main(String[] args) {
		// 조건문
		// 특정한 조건을 만족하면 수행할 작업과 만족하지 않을 때 수행할 작업을 미리 정해놓고,
		// 조건에 따라 각각 다르게 실행하도록 만들어 놓은 구문.
		
		// if문
		// if문은 가장 기본적인 조건문으로 조건식 부분과 실행 부분으로 나누어져 있습니다.
		
		int age = 8;
		System.out.println(age>=8);
		if(age>=8) {
			System.out.println("학교에 다닙니다.");
		}
		
		System.out.println("검사가 끝났습니다.");
	}
}