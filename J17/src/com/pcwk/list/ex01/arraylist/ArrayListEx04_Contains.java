package com.pcwk.list.ex01.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx04_Contains {

	public static void main(String[] args) {
		ArrayList<String> lectureList = new ArrayList<>(Arrays.asList("JAVA", "ORACLE", "WEB", "SPRING", "C"));
		
		// 데이터 존재 유무
		boolean contains = lectureList.contains("WEB");
		System.out.println("contains : " + contains);
		
		// 특정 데이터의 인덱스 : 존재하는 경우
		int index = lectureList.indexOf("WEB");
		System.out.println("index : " + index);
		// 없는 데이터
		index = lectureList.indexOf("HTML");
		System.out.println("index : " + index);
	}
}
//contains : true
//index : 2
//index : -1