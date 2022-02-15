package com.pcwk.oop05;

public class TvMain {

	public static void main(String[] args) {
		// 조상타입의 참조변수로 자손타입의 인스턴스를 참조 할 수 있다.
		// 반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조 할 수 없다.
		CaptionTv cTv = new CaptionTv();
//		CaptionTv cTv02 = new Tv();

		Tv t = new CaptionTv();

	}

}
