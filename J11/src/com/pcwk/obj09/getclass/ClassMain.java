package com.pcwk.obj09.getclass;

public class ClassMain {

	public static void main(String[] args) {
		Card c01 = new Card("Heart", 3);
		System.out.println(c01);
		// Class cObj = Card.class
		try {
			Card c02 = Card.class.newInstance(); // default 생성자를 통해 객체생성!
			
			System.out.println(c02);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class cObj = c01.getClass();
		// 클래스 이름
		System.out.println(cObj.getName());
		System.out.println(cObj.toString());
		
	}

}
