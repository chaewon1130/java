package com.pcwk.oop11.abstracted;

public class Squirtle extends Pokemon {

	public Squirtle() {
		this.name = "꼬부기";
	}

	@Override
	void attack() {
		System.out.println("물 공격");
	}

	@Override
	void sound() {
		System.out.println("꼬북 꼬북!");
	}

}
