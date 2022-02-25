package com.pcwk.list.ex01.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {

		List<String> list01 = new ArrayList<>();
		// 객체 추가 : 리스트의 끝에 추가
		list01.add("JAVA");
		list01.add("ORACLE");

		// 특정 index에 추가 : 그 인덱스 부터의 값들이 1칸씩 밀린다.
		list01.add(0, "C");

		// 값 변경 : set
		list01.set(0, "B");

		System.out.println("list01 : " + list01.toString());
	}
}
// list01 : [B, JAVA, ORACLE]