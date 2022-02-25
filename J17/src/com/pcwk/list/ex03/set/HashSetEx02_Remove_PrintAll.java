package com.pcwk.list.ex03.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx02_Remove_PrintAll {

	public static void main(String[] args) {
		// 추가
		HashSet<String> lectureSet = new HashSet<>();
		lectureSet.add("C");
		lectureSet.add("JAVA");
		lectureSet.add("WEB");
		lectureSet.add("SPRING");

		HashSet<String> lectureCpSet = new HashSet<>(lectureSet);

		System.out.println("lectureSet : " + lectureSet);

		// 삭제
		lectureSet.remove("C");
		System.out.println("lectureSet : " + lectureSet);

		// 다건 삭제
		lectureSet.removeAll(Arrays.asList("JAVA", "WEB"));
		System.out.println("lectureSet : " + lectureSet);

		// 전체 삭제
		lectureSet.clear();
		System.out.println("lectureSet : " + lectureSet);
		System.out.println("====전체출력===========================");

		// for-each loop
		for (String lec : lectureCpSet) {
			System.out.print(lec + ", ");
		}
		System.out.println();

		// iterator
		Iterator<String> iter = lectureCpSet.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
	}
}
//lectureSet : [JAVA, SPRING, C, WEB]
//lectureSet : [JAVA, SPRING, WEB]
//lectureSet : [SPRING]
//lectureSet : []
//====전체출력===========================
//JAVA, SPRING, C, WEB, 
//JAVA, SPRING, C, WEB, 