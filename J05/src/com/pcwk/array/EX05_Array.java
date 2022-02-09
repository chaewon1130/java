package com.pcwk.array;

import java.util.Arrays;

public class EX05_Array {

	public static void main(String[] args) {
		char[] alphabet = new char[26];
		// A~Z 출력
		char ch = 'A';

		for (int i = 0; i < alphabet.length; i++, ch++) {
			alphabet[i] = ch;
		}
		System.out.println(Arrays.toString(alphabet));
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println((int) alphabet[i] + " : " + alphabet[i]);
		}
	}
}