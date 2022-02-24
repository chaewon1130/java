package com.pcwk.time.ex07.generics;

public class GenericPrint<T> {

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	public String toString() {
		return material.toString();
	}

}