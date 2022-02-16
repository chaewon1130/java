package com.pcwk.oop04.inter;

public interface Calc {
	// 인터페이스
	// 모든 메소드가 추상 메소드(abstract), 모든 변수가 상수(public final)
	// 변수에 public final 생략가능
	// 메소드에 public abstract 생략가능

	// public final double PI = 3.14;
	double PI = 3.14;
	int ERROR = -999999;

//	public abstract int add(int num1, int num2);
	/**
	 * 더하기
	 * 
	 * @param num1
	 * @param num2
	 * @return num1+num2
	 */
	int add(int num1, int num2);

	int substract(int num1, int num2);

	int divide(int num1, int num2);

	int times(int num1, int num2);

	// 추가적인 메소드를 넣으면
	// implements받은 클래스에서 @Override 필요!
//	int nothing();

	// jdk1.8 이후 추가
	// default 메소드
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
	}

	// static 메소드
	static int total(int[] arr) {
		int total = 0;

		// 향상된 for문
		for (int i : arr) {
			total += i;
		}
		return total;
	}

	// 일반 메소드 불가
//	public void disp() {
//		
//	}
}
