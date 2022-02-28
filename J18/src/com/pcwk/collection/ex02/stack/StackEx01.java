package com.pcwk.collection.ex02.stack;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		// 추가
		stack.push("JAVA");
		stack.push("ORACLE");
		stack.push("WEB");
		stack.push("SPRING");
		stack.push("C");

		// 꺼내기
		while (!stack.empty()) { // stack이 비워져 있지 않을때 까지
			System.out.println(stack.pop());
		}
	}
}
//C
//SPRING
//WEB
//ORACLE
//JAVA