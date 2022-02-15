package com.pcwk.oop10.abstracted;

public class AudioPlay extends Play {

	@Override
	void play(int pos) {
		System.out.println("play() 호출" + pos);
	}

	@Override
	void stop() {
		System.out.println("stop() 호출");

	}

}
