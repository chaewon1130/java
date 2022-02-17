package com.pcwk.obj01;

public class Card {
	String kind;
	int number;

	public Card() {
		this("Spade", 1);
	}

	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

}
