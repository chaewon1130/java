package com.pcwk.list.ex02.linkedlist;

import java.util.*;

public class LinkedListEx02 {

	// 데이터 삭제
	public static void main(String[] args) {
		
		// 데이터 중복 허용, 순서유지
		LinkedList<String> lectureList = new LinkedList<>(Arrays.asList("C", "JAVA", "ORACLE", "WEB", "SPRING", "C"));
		System.out.println("lectureList : " + lectureList);
		
		// 데이터 삭제 : index
		String removeLecture = lectureList.remove(0);
		System.out.println("removeLecture : " + removeLecture);
		System.out.println("lectureList : " + lectureList);

		// 데이터로 삭제
		boolean flag = lectureList.remove(removeLecture);
		System.out.println("삭제유무 : " + flag);
		System.out.println("lectureList : " + lectureList);
		
		// 데이터 모두 삭제
		lectureList.clear();
		System.out.println("lectureList : " + lectureList);
	}
}
//lectureList : [C, JAVA, ORACLE, WEB, SPRING, C]
//removeLecture : C
//lectureList : [JAVA, ORACLE, WEB, SPRING, C]
//삭제유무 : true
//lectureList : [JAVA, ORACLE, WEB, SPRING]
//lectureList : []