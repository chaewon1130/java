package com.pcwk.oop01;

public class TvMain {

	public static void main(String[] args) {
		// 클래스명 변수명 : 클래스의 객체를 참조하기 위한 참조 변수
		// 변수명 = new 클래스명(); : 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
		
		Tv t; // Tv인스턴스를 참조하기 위한 변수 t
		t = new Tv(); // Tv 인스턴스를 생성
		System.out.println("전원 : "+t.power);
		t.power(); // 전원 켜기
		System.out.println("전원 : "+t.power);
		
		t.channel = 3; // tvN
		t.volume = 11;
		
		System.out.println("현 채널 : " + t.channel);
		System.out.println("볼륨 : " + t.volume);
		
		// 메소드 호출
		t.channelUp();
		System.out.println("현 채널 : " + t.channel);
		
		// 전원OFF
		t.power();
		System.out.println("전원 : " + t.power);
	}
}