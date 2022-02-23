package com.pcwk.util.ex02.stringtokenizer;

import java.util.StringTokenizer;

public class TokenizerEx03 {

	public static void main(String[] args) {
		String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		
		StringTokenizer st = new StringTokenizer(source, "|");
		
		while(st.hasMoreTokens()) {
			String man = st.nextToken();
//			System.out.println(man);
			StringTokenizer st02 = new StringTokenizer(man, ",");
			while(st02.hasMoreTokens()) {
				System.out.println(st02.nextToken());
			}
		}
	}
}
//1
//김천재
//100
//100
//100
//2
//박수재
//95
//80
//90
//3
//이자바
//80
//90
//90