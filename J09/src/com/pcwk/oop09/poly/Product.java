package com.pcwk.oop09.poly;

public class Product {
	int price; // 제품가격
	int bonusPoint; // 적립금

	public Product() {

	}

	public Product(int price) {
		this.price = price;
		// 10%로 적립
		this.bonusPoint = (int) (price / 10.0);
	}
}
