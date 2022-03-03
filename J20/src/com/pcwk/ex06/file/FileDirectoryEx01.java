package com.pcwk.ex06.file;

import java.io.File;
import java.io.IOException;

public class FileDirectoryEx01 {
	// File API
	public static void main(String[] args) throws IOException {
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex06\\file\\FileDirectoryEx01.bak";

		// 파일객체 생성
//		File file = new File(filePath);
//		File file = new File("C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex06\\file", "FileDirectoryEx01.bak");
		File dir = new File("C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex06\\file");
		File file = new File(dir, "FileDirectoryEx01.bak");
		// 신규파일 생성
		file.createNewFile();

		// File객체는 파일과 디렉토리를 처리
		System.out.println("파일 여부 : " + file.isFile());
		System.out.println("디렉토리 여부 : " + file.isDirectory());

		System.out.println("경로를 제외한 파일명 : " + file.getName());
		System.out.println("파일이 속해있는 디렉토리 : " + file.getParent());
		System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());

		// OS별 pathSeparator
		System.out.println("path Separator : " + file.pathSeparator);
		System.out.println("separator : " + file.separator);
		System.out.println("============================");

		System.out.println("파일 Read권한 : " + file.canRead());
		System.out.println("파일 Write권한 : " + file.canWrite());
		System.out.println("파일 Execute권한 : " + file.canExecute());
	}
}
//파일 여부 : true
//디렉토리 여부 : false
//경로를 제외한 파일명 : FileDirectoryEx01.bak
//파일이 속해있는 디렉토리 : C:\DCOM_20220127\01_JAVA\workspace\J20\src\com\pcwk\ex06\file
//파일의 절대 경로 : C:\DCOM_20220127\01_JAVA\workspace\J20\src\com\pcwk\ex06\file\FileDirectoryEx01.bak
//path Separator : ;
//separator : \
//============================
//파일 Read권한 : true
//파일 Write권한 : true
//파일 Execute권한 : true
