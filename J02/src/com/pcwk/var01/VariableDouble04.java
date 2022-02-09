/**
 * 패키지 : com.pcwk.var01
 * 파일 : VariableDouble04.java
 * 작성자 : ITSC
 */
package com.pcwk.var01;

/**
 * @author ITSC
 *
 */
public class VariableDouble04 {
	/*
		실수자료형 : float,double
		부동 소수점 방식 : 실수를 지수부와 가수부로 표현
		무한의 실수를 표현하기 위한 방식
		0.1을 표현
	*/
	public static void main(String[] args) {
//		float fNum = 3.14; // 실수의 default자료형은 double
		// float으로 표현 하려면 f, F 숫자 끝에 붙인다.
		float fNum = 3.14f;
		double dNum = 3.14;
		System.out.println("fNum = "+fNum);
		System.out.println("dNum = "+dNum);
		
	}
}