package com.pcwk.util.ex02.stringtokenizer;

import java.util.StringTokenizer;

public class TokenizerEx02 {

	/**
	 * + - * / =()
	 */
	public static void main(String[] args) {
		
		String expression = "x=100*(200+300)/2";
		
		// true : token delimeter return
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
//x
//=
//100
//*
//(
//200
//+
//300
//)
///
//2
