package com.pcwk.oop11.abstracted;

/**
 * Pokemon 추상클래스
 * 
 * @author ITSC
 *
 */
public abstract class Pokemon {
	String name;

	abstract void attack();

	abstract void sound();

	public String getName() {
		return name;
	}

}
