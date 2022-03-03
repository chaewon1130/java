package com.pcwk.ex06.file;

import java.io.File;

public class FileDirectoryEx02 {
	// Directory 다루기
	public static void main(String[] args) {
		if (args.length != 1) { // param이 없으면 종료
			System.out.println("파라미터를 입력 하세요.");
			System.exit(0);
		}
		// ""로 싸면 param을 1개로 인식
		System.out.println("param : " + args[0]);

		File dir = new File(args[0]);

		// 디렉토리가 아니면 종료 || 존재하지 않으면 종료
		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}

		// 디렉토리 내부에 파일정보 File[] return
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}

	}
}