package com.pcwk.collection.ex02.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx02 {

	// 수식에 괄호 검사
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Example : java StackEx02 \"((2+3)*1+3)\" ");
			System.exit(0);
		}
		String expression = args[0];
		System.out.println("expression : " + expression);
		
		Stack<Character> st = new Stack<>();
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				// "(" stack에 추가
				// ")" stack에서 제거
				if(ch == '(') {
					st.add(ch);
				}else if(ch == ')') {
					st.pop();
				}
			}
			if(st.empty()) {
				System.out.println("괄호 일치!");
			}else {
				System.out.println("괄호 불일치!");
			}
			
		}catch(EmptyStackException e) {
			System.out.println("괄호 불일치");
		}
		
		
		System.out.println("프로그램 종료!");
	}
}
//expression : ((2+3)*1+3)
//괄호 일치!
//프로그램 종료!