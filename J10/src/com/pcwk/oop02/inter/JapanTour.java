package com.pcwk.oop02.inter;

public class JapanTour implements Providable {

	@Override
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프");
	}

	@Override
	public void sightseeing() {
		System.out.println("오사카 관람");
	}

	@Override
	public void food() {
		System.out.println("초밥 먹방");
	}

}
