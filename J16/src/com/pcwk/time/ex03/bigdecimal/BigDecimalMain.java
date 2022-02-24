package com.pcwk.time.ex03.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalMain {

	public static void main(String[] args) {
		double a = 24.3953;
		double b = 50.343998;
		// window 계산기 : 74.739298
		System.out.println(a+b);
		// 74.73929799999999
		// 10진수를 2진수로 변환 시 오차 발생!
		
		// 실수 -> 정수 * 10의 -n
		BigDecimal num01 = new BigDecimal(String.valueOf(a));
		BigDecimal num02 = new BigDecimal(String.valueOf(b));
		System.out.println(num01.add(num02));
	}
}
//74.73929799999999
//74.739298
