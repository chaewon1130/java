package com.pcwk.list.ex03.set;

import java.util.*;

public class HashSetEx03_Contains {

	// 데이터 존재 유무가 중요한 경우 사용
	public static void main(String[] args) {
		HashSet<String> lectureSet = new HashSet<>();
		lectureSet.add("C");
		lectureSet.add("JAVA");
		lectureSet.add("WEB");
		lectureSet.add("SPRING");
		
		// 있으면 : true, 그렇지 않으면 :false
		System.out.println("JAVA있나요? : " + lectureSet.contains("JAVA"));
		System.out.println("B : " + lectureSet.contains("B")); // B:false
	}
}