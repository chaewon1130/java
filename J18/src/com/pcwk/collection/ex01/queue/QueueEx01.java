/**
* <pre>
* com.pcwk.collection.ex01.queue
* Class Name : QueueEx01.java
* Description: Queue
* Author: ITSC
* Since: 2022/02/28
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/28 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.collection.ex01.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {

		// Queue는 interface로
		// 구현(implements)한 LinkedList
		Queue<String> queue = new LinkedList<>();

		// 추가
		System.out.println(queue.add("C")); // true 성공적인 추가
		queue.add("JAVA");
		queue.add("ORACLE");
		queue.add("WEB");
		queue.add("SPRING");
		queue.offer("LINUX");

		System.out.println(queue);

		// 삭제
		boolean flag = queue.remove("C");
		System.out.println("flag : " + flag);
		System.out.println(queue);

		// iterator
		Iterator<String> iter = queue.iterator();
		String delim = ", ";
		int num = 0;
		while (iter.hasNext()) {
			if (num == queue.size() - 1) {
				delim = " ";
			}
			System.out.print(iter.next() + delim);
			num++;
		}
	}
}
//true
//[C, JAVA, ORACLE, WEB, SPRING, LINUX]
//flag : true
//[JAVA, ORACLE, WEB, SPRING, LINUX]
//JAVA, ORACLE, WEB, SPRING, LINUX 