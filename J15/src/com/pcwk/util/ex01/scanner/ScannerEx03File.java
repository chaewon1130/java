package com.pcwk.util.ex01.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx03File {

//	100,100,100 한 줄을 읽는다. 100,100,100 -> 100 100 100
//	200,200,200
//	300,300,300
//	400,400,400
//	500,500,500
	public static void main(String[] args) {
//		"C:\\DCOM_20220127\\01_JAVA\\workspace\\J15\\src\\com\\pcwk\\util\\ex01\\scanner\\data99array.txt"
		try {
			Scanner scanner = new Scanner(new File(
					"C:\\DCOM_20220127\\01_JAVA\\workspace\\J15\\src\\com\\pcwk\\util\\ex01\\scanner\\data99array.txt"));
			int totalSum = 0; // 총합
			int cnt = 0; // 건수

			while (scanner.hasNextLine()) { // 데이터가 있는 라인이 있으면 true, 없으면 false
				String line = scanner.nextLine(); // 100 100 100

				// 데이터를 ","기준으로 자르기
				Scanner sc02 = new Scanner(line).useDelimiter(",");
				int sum = 0;
				while (sc02.hasNextInt()) {
					sum += sc02.nextInt();
				}
				totalSum += sum;
				cnt++;
			}
			System.out.println(totalSum);
			System.out.println(cnt);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("file read 성공!");

	}
}