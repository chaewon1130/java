package com.pcwk.obj02;

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

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}

}
