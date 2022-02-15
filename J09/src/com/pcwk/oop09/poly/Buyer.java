package com.pcwk.oop09.poly;

public class Buyer {
	int money = 10000; // 소유금액
	int bonusPoint = 0; // 보너스 금액

	Product[] item = new Product[10]; // Tv, 컴퓨터, 오디오 담을 배열
	int i = 0; // 배열에 사용될 counter

	// 구매 메소드
	void buy(Product p) {
		// 잔고확인
		if (money < p.price) {
			System.out.println("잔고를 확인 하세요");
			return;
		}
		money -= p.price; // 가진돈에서 제품가격 차감
		bonusPoint += p.bonusPoint; // 보너스금액 증가
		item[i++] = p; // 제품을 Product[]에 저장
		System.out.println(p.toString() + "을/를 구입하셨습니다.");
	}

	// 구매한 제품 요약 정보
	void summary() {
		int sum = 0; // 총 구매금액 합계
		String itemList = ""; // 구매 목록

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break; // 객체가 null이면 break
			sum += item[i].price;
			itemList += item[i].toString() + " , ";
		}
		System.out.println("구매내역 : " + itemList);
		System.out.println("구매 총 금액 : " + sum);
		System.out.println("잔액 : " + money);
		System.out.println("보너스 포인트 : " + bonusPoint);
	}
}
