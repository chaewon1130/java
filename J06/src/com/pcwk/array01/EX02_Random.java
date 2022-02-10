package com.pcwk.array01;

public class EX02_Random {

	public static void main(String[] args) {
		// 난수발생
		// 0~9 난수
		// Math.random()
		// 0.0<= x < 1.0
		// 10을 곱하고
		// (int)로 캐스팅
		
//		System.out.println("난수 : " + Math.random());
		System.out.println("난수 : " + (Math.random()*10));
		System.out.println("난수 : " + (int)(Math.random()*10));
	}
}