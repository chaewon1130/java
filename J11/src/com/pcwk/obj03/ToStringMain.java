package com.pcwk.obj03;

public class ToStringMain {

	public static void main(String[] args) {
		String str = new String("KOREA IT");
		
		// toString()이 문자열이 반환 되도록 오버라이딩 되어있다.
		
		System.out.println(str);
		System.out.println(str.toString());
		
		// toString()이 날짜 문자열이 반환 되도록 오버라이딩 되어있다.
		// import없이 클래스를 사용
		java.util.Date today = new java.util.Date();
		System.out.println(today);
		System.out.println(today.toString());
		
		
	}
}