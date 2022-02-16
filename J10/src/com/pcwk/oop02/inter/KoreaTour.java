package com.pcwk.oop02.inter;

public class KoreaTour implements Providable {

	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키");
	}

	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람");
	}

	@Override
	public void food() {
		System.out.println("삼겹살 먹방");
	}

}
