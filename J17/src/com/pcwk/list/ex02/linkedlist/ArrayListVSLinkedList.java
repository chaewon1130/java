package com.pcwk.list.ex02.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		// 순차적인 추가
		// ArrayList VS LinkedList : ArrayList
		ArrayList<String> arrayList = new ArrayList<>(1_000_000);
		LinkedList<String> linkedList = new LinkedList<>();
		System.out.println("-순차적인 추가-");
		System.out.println("ArrayList : " + addSequential(arrayList));
		System.out.println("LinkedList : " + addSequential(linkedList));
		// 중간에 추가
		// ArrayList VS LinkedList : LinkedList
		System.out.println("-중간에 추가-");
		System.out.println("ArrayList : " + addMiddle(arrayList));
		System.out.println("LinkedList : " + addMiddle(linkedList));
		
		System.out.println("-뒤부터 삭제-");
		System.out.println("ArrayList : " + removeArrayList(arrayList));
		System.out.println("LinkedList : " + removeArrayList(linkedList));


	}
	
	/**
	 * 뒤 에서부터 삭제
	 * @param list
	 * @return
	 */
	public static long removeArrayList(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	/**
	 * 중간에 추가
	 * 
	 * @param list
	 * @return long
	 */
	public static long addMiddle(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			list.add(999, String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	/**
	 * 순차적인 추가
	 * 
	 * @param list
	 * @return long
	 */
	public static long addSequential(List<String> list) {
		long start = System.currentTimeMillis();
		// 천단위 구분자
		// 1000000 -> 1_000_000
		for (int i = 0; i < 1_000_000; i++) {
			list.add(i + "");
		}

		long end = System.currentTimeMillis();
		return end - start;
	}
}
//-순차적인 추가-
//ArrayList : 95
//LinkedList : 1163
//-중간에 추가-
//ArrayList : 10987
//LinkedList : 280
//-뒤부터 삭제-
//ArrayList : 5
//LinkedList : 30