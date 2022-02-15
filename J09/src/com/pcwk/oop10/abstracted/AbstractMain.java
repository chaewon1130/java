package com.pcwk.oop10.abstracted;

public class AbstractMain {

	public static void main(String[] args) {
//		Play play = new Play();
		// 추상클래스는 스스로 객체를 만들 수 없다
		// -> 상속받은 자식을 통해 생성

		Play play = new AudioPlay();
		play.play(5); // 추상메소드 호출
		play.disp(); // 일반메소드 호출

	}
}