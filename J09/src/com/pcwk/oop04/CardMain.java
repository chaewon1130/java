package com.pcwk.oop04;

public class CardMain extends Card{

	public static void main(String[] args) {
		Card card = new Card("Heart", 10);
//		card.NUMBER = 1;
		// 상수는 값을 설정하면 값 변경 불가
		
		System.out.println(card.toString());
	}
	
//	public void disp() {
//		
//	}
}