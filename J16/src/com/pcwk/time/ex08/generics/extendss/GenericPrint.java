package com.pcwk.time.ex08.generics.extendss;

// <T extends Material>
// Material을 상속 받은 클래스만 올 수 있다.
public class GenericPrint<T extends Material> {

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