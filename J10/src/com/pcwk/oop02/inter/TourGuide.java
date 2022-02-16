package com.pcwk.oop02.inter;

public class TourGuide {

	// private Providable tour = new KoreaTour();
	private Providable tour = null;

	public TourGuide() {

	}
	
	// 약한 결합 : KoreaTour(), JapanTour() 알 필요가 없다.
	public TourGuide(Providable tour) {
		this.tour = tour;
	}

	public void leisureSports() {
		tour.leisureSports();
	}

	public void sightseeing() {
		tour.sightseeing();
	}

	public void food() {
		tour.food();
	}
}
