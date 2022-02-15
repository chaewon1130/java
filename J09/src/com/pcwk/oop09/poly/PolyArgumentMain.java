package com.pcwk.oop09.poly;

public class PolyArgumentMain {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();

		Tv t = new Tv();
		buyer.buy(t);

		buyer.buy(new Computer());

		buyer.summary();
	}
}