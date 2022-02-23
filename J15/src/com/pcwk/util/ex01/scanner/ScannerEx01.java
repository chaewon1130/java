package com.pcwk.util.ex01.scanner;

import java.util.*;
public class ScannerEx01 {
	
	// Scanner동안 무한 입력
	// 프로그램 종료
	public static void main(String[] args) {
		// keyboard input
		Scanner scanner = new Scanner(System.in);
		String[] argArr = null;		
		
		while(true) {
			System.out.println("q를 입력하면 프로그램 종료.");
			String prompt = ">>";
			System.out.print(prompt);
			
			// Line단위 입력
			String input = scanner.nextLine();
			
			input = input.trim(); // 앞뒤 공백 제거
			// abc 1234 678
			// RegExp : '+' 1회 이상 반복
			argArr = input.split(" +"); // 입력받은 내용을 공백을 구분자로 자른다.
			
			// 제일 앞 문자를 잘라 낸다
			String command = argArr[0].trim();
			
			if("".equals(command)) {
				continue;
			}
			
			// 명령어를 소문자로 변환
			command = command.toLowerCase();
			
			if(command.equals("q")) {
				System.out.println("프로그램을 종료!");
				System.exit(0); // 0번이면 정상, 그 이외는 비정상
			}else {
				for(int i=0; i<argArr.length; i++) {
					System.out.println(argArr[i]);
				}
			}
		}
	}
}