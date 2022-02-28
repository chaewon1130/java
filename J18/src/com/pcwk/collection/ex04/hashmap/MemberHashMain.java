package com.pcwk.collection.ex04.hashmap;

import com.pcwk.collection.ex03.hashmap.Member;

public class MemberHashMain {

	public static void main(String[] args) {
		MemberHashMap memberMap = new MemberHashMap();
		
		Member member01 = new Member(1, "오일남");
		Member member02 = new Member(67, "강새벽");
		Member member03 = new Member(101, "장덕수");
		Member member04 = new Member(199, "알리압둘");
		Member member05 = new Member(456, "성기훈");
		
		memberMap.addMember(member01);
		memberMap.addMember(member02);
		memberMap.addMember(member03);
		memberMap.addMember(member04);
		memberMap.addMember(member05);
		
		memberMap.addMember(member01); // 오일남 추가 (중복 불가)
		
		// 전체 출력
		memberMap.showAllMember();
		
		// 삭제
		memberMap.removeMember(101);
		System.out.println("========================================");
		
		// 전체 출력
		memberMap.showAllMember();
	}
}
//1, Member [memberId=1, memberName=오일남]
//67, Member [memberId=67, memberName=강새벽]
//101, Member [memberId=101, memberName=장덕수]
//199, Member [memberId=199, memberName=알리압둘]
//456, Member [memberId=456, memberName=성기훈]
//========================================
//1, Member [memberId=1, memberName=오일남]
//67, Member [memberId=67, memberName=강새벽]
//199, Member [memberId=199, memberName=알리압둘]
//456, Member [memberId=456, memberName=성기훈]