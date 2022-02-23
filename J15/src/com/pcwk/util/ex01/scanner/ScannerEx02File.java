package com.pcwk.util.ex01.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx02File {

	// Scanner통해 파일 읽기
	public static void main(String[] args) {
		
		try {
			// 절대 경로 방식으로 파일 읽기
//			Scanner scanner = new Scanner(new File("C:\\DCOM_20220127\\01_JAVA\\workspace\\J15\\src\\com\\pcwk\\util\\ex01\\scanner\\data99.txt"));
			// 상대 경로 방식으로 파일 읽기
			Scanner scanner = new Scanner(new File("data99.txt"));// /프로젝트명/파일이름
			int sum = 0; // 합계
			int cnt = 0; // 읽은 라인수
			
			while(scanner.hasNextInt()) {//Data가 있으면 true, 더 이상 없으면 false
				sum += scanner.nextInt();
				cnt++;
			}
			System.out.println("sum : " + sum);
			System.out.println("cnt : " + cnt);
			System.out.println("avg : " + (double)sum/cnt);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
