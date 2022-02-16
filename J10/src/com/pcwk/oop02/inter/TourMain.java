package com.pcwk.oop02.inter;

public class TourMain {

	public static void main(String[] args) {
//		TourGuide guide = new TourGuide(new KoreaTour());
		TourGuide guide = new TourGuide(new JapanTour());
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
	}
}