package com.pcwk.util.ex02.stringtokenizer;

import java.util.StringTokenizer;

public class TokenizerEx01 {

//	긴 문자열을 지정된 구분자(delimiter)를 기준으로 토큰(token)이라는 여러개 
//	문자열로 잘라내는 데 사용한다.
	public static void main(String[] args) {
		String source = "100,200,300,400,500";

		StringTokenizer st = new StringTokenizer(source, ","); // \t\n\r\f 구분자

		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
//100
//200
//300
//400
//500
