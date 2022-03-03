package com.pcwk.ex05.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx01 {

	public static void main(String[] args) {
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex05\\buffer\\BufferedReaderEx01.java";
		try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) {
			String line = ""; // 라인 단위 read
			int i = 1;
			while ((line = br.readLine()) != null) {
				System.out.println(i + "\t" + line);
				i++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("=FileNotFoundException======");
			System.out.println(e.getMessage());
			System.out.println("============================");
		} catch (IOException e) {
			System.out.println("===============");
			System.out.println(e.getMessage());
			System.out.println("===============");
		}
		System.out.println("프로그램 종료");
	}
}