package com.pcwk.obj02;

public class CardMain {

	public static void main(String[] args) {
		Card c01 = new Card();
		System.out.println(c01.toString());
		Card c02 = new Card("Spade", 10);
		System.out.println(c02.toString());

	}
}