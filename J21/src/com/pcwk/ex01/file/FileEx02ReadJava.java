package com.pcwk.ex01.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEx02ReadJava {

	static int found = 0; // 특정 단어 count
	// 디렉토리 내에 파일 읽고 특정 단어 count

	public static void main(String[] args) {
		// param : 디렉토리, 검색어
//		String dirPath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J21\\src";
//		String keyword = "class";

		// param이 2개가 아니면 종료
		if (args.length != 2) {
			System.out.println("Directory, Keyword를 입력하세요");
			System.exit(0);
		}

		// param 출력
		for (String p : args) {
			System.out.println("param : " + p);
		}

		File dir = new File(args[0]); // 디렉토리 정보
		String keyword = args[1]; // 검색어

		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0);
		}

		try {
			findInFiles(dir, keyword);
		} catch (IOException e) {
			System.out.println("========================");
			System.out.println("=IOException=" + e.getMessage());
			System.out.println("========================");
			e.printStackTrace();
		}

		System.out.println("===========================================");
		System.out.println("총 " + found + "개의 라인에서 " + keyword + "를 발견하였습니다.");

	}// - main

	// *.java파일 내에서 keyword가 몇개 있는지 count
	public static void findInFiles(File dir, String keyword) throws IOException {

		File[] files = dir.listFiles(); // file, directory
		for (int i = 0; i < files.length; i++) {
			// 디렉토리이면 재귀호출
			if (files[i].isDirectory()) {
				findInFiles(files[i], keyword);
			} else { // 파일이면서 *.java
				String fileName = files[i].getName();
				int idx = fileName.lastIndexOf(".");
				String extension = fileName.substring(idx + 1);

				if (!"java".equals(extension)) {
					continue;
				}

				// 2byte char 처리
				FileReader fr = new FileReader(files[i]);
				BufferedReader br = new BufferedReader(fr);

				String data = ""; // 한줄 데이터
				int lineNum = 0; // 라인 넘버
				while ((data = br.readLine()) != null) {
					lineNum++;
					// 해당 라인에 키워드가 있으면
					if (data.indexOf(keyword) != -1) {
						System.out.println(lineNum + "\t" + data);
						found++; // keyword를 찾으면 1건씩 증가
					}
				}
				System.out.println();
				br.close();
			}

		} // - for

	}// - findInFiles
}