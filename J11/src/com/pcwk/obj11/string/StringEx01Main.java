package com.pcwk.obj11.string;

public class StringEx01Main {

	public static void main(String[] args) {
		String str01 = new String("청춘");
		String str02 = new String("청춘");
		// 데이터 비교는 equals로 할 것
		System.out.println(str01.equals(str02));
		// 주소 비교
		System.out.println(str01 == str02);
		
		String str03 = "청춘";
		String str04 = "청춘";
		
		System.out.println(str03 == str04);
		// String의 동등비교는 항상 equals 사용할 것!
		System.out.println(str03.equals(str04));
	}

}
