package com.pcwk.ed01;

public class EX05_Operator {
	public static void main(String[] args) {
		// 삼항 연산자
		// 삼항 연산자는 항이 세 개인 연산자입니다.
		// 조건식의 참 / 거짓 여부에 따라서 각각 다른 결과를 반환합니다.
		// 조건?항목1:항목2
		
		int fatherAge = 23;
		int motherAge = 19;
		
		char ch = ' ';
		ch = (fatherAge > motherAge)?'T':'F';
		System.out.println("ch = "+ch);
		
	}
}