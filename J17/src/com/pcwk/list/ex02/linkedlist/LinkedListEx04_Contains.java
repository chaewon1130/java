package com.pcwk.list.ex02.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListEx04_Contains {

	public static void main(String[] args) {
		// 값 존재 유무 확인
		LinkedList<String> lectureList = new LinkedList<>(Arrays.asList("C", "JAVA", "ORACLE", "WEB", "SPRING", "C"));

		boolean contains = lectureList.contains("WEB");
		System.out.println("contains : " + contains);

		// 데이터가 있으면 해당 index 출력
		int index = lectureList.indexOf("WEB");
		System.out.println("index : " + index);

		// 데이터가 없는 경우 : -1
		index = lectureList.indexOf("SVM");
		System.out.println("index : " + index);
	}
}
//contains : true
//index : 3
//index : -1