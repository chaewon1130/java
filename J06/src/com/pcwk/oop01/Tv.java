package com.pcwk.oop01;

public class Tv {
	// 변수 : 인스턴스 변수
	public boolean power; // 전원상태
	public int volume; // 소리
	public int channel; // 채널

	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}

	public void power() {
		power = !power;
	}
}
