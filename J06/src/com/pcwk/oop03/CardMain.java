package com.pcwk.oop03;

public class CardMain {

	public static void main(String[] args) {
		System.out.println("Card.width : " + Card.width);
		System.out.println("Card.height : " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 2;

		System.out.println("c1 : " + c1.kind + " " + c1.number);
		System.out.println("c1 : " + c1.width + " " + c1.height);
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 7;
		System.out.println("c2 : " + c2.kind + " " + c2.number);
		System.out.println("c2 : " + c2.width + " " + c2.height);
		
		c1.width = 88;
		c1.height = 99;
		System.out.println("=============");
		System.out.println("c1 : " + c1.width + " " + c1.height);
		System.out.println("c2 : " + c2.width + " " + c2.height);

		
	}
}