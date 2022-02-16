package com.pcwk.oop03.inter;

public class MyCellPhone implements Call, Camera, Clock, Memo {

	@Override
	public void write() {
		System.out.println("write() 호출");

	}

	@Override
	public void clock() {
		System.out.println("clock() 호출");
	}

	@Override
	public void photo() {
		System.out.println("photo() 호출");

	}

	@Override
	public void calling() {
		System.out.println("calling() 호출");

	}

}
