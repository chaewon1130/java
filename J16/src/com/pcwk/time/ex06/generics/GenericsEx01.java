package com.pcwk.time.ex06.generics;

import java.util.*;

public class GenericsEx01 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("apple");

		// 제네릭스(generics) 사용하지 않으면 casting 필요!
		String str = (String) list.get(0);
		
		List<String> list01 = new ArrayList<String>();
		list01.add("apple");
		
		// casting 불필요!
		String str01 = list01.get(0);

	}
}