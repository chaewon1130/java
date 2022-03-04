package com.pcwk.ex01.file;

import java.io.File;
import java.util.ArrayList;

public class FileEx01 {

	static int totalFiles = 0; // 총 파일 수
	static int totalDirs = 0; // 총 디렉토리 수

	// 디렉토리 내에 파일과 디렉토리 count
	public static void main(String[] args) {
		// "C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src"
		String path = "";
		// args.length 1개가 아니면 프로그램 종료
		if (args.length != 1) {
			System.out.println("디렉토리를 입력 하세요.");
			System.exit(0);
		}

		path = args[0];
		File f = new File(path);
		// f가 존재하는지, 디렉토리인지 확인
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}

		printFileList(f);
		System.out.println("=======================");
		System.out.println("총 파일 : " + totalFiles);
		System.out.println("총 디렉토리 : " + totalDirs);
		System.out.println("=======================");
	}// - main

	// 디렉토리와 파일 count
	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath() + " 디렉토리");

		File[] files = dir.listFiles(); // 하부에 있는 파일과 디렉토리 목록

		// 서브 디렉토리를 저장할 ArrayList
		ArrayList<String> subDir = new ArrayList<>();
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName(); // 파일과 디렉토리 명
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);

			if (files[i].isDirectory()) {
				subDir.add(String.valueOf(i));
			}
		} // - for

		int dirNum = subDir.size(); // subDir 수
		// files.length(파일+디렉토리) - 디렉토리 = 파일 수
		int fileNum = files.length - dirNum;

		// 총 누적 파일
		totalFiles += fileNum;
		// 총 누적 디렉토리
		totalDirs += dirNum;

		System.out.println(fileNum + " 개의 파일, " + dirNum + " 개의 디렉토리");

		// 디렉토리이면 재귀 호출
		for (int i = 0; i < subDir.size(); i++) {
			int idx = Integer.parseInt(subDir.get(i));
			printFileList(files[idx]);
		}
	}// - printFileList
}