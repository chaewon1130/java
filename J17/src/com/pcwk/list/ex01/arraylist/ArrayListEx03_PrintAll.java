package com.pcwk.list.ex01.arraylist;

import java.util.*;

public class ArrayListEx03_PrintAll {

	public static void main(String[] args) {
		ArrayList<String> lectureList = new ArrayList<>(Arrays.asList("C", "JAVA", "ORACLE", "WEB", "SPRING", "C"));
		
		// for-each : 향상된 for문
		for(String lec : lectureList) {
			System.out.print(lec+", ");
		}
		System.out.println("");
		
		// for 반복문
		for(int i=0; i<lectureList.size(); i++) {
			if(i == lectureList.size()-1) {
				System.out.print(lectureList.get(i) + " ");
			}else {
				System.out.print(lectureList.get(i) + ", ");
			}
		}
		System.out.println("");
		
		// iterator : 앞에서 부터 뒤로 반복 출력
		// while
		Iterator<String> iterator = lectureList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + ", ");
		}
		System.out.println("");
		
		// ListIterator : 뒤에서 부터 앞으로 출력
		ListIterator<String> listIterator = lectureList.listIterator(lectureList.size()); // start index
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + ", ");
		}
	}
}
//C, JAVA, ORACLE, WEB, SPRING, C, 
//C, JAVA, ORACLE, WEB, SPRING, C 
//C, JAVA, ORACLE, WEB, SPRING, C, 
//C, SPRING, WEB, ORACLE, JAVA, C, 