package com.pcwk.obj01;

public class CardMain {

	public static void main(String[] args) {
		Card c01 = new Card();
		System.out.println(c01);
		// c01 == c02.toString()
		// 컴파일러가 c02.toString()을 호출 한다.
		Card c02 = new Card();
		System.out.println(c02.toString());

	}
}