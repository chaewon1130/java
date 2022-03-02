package com.pcwk.ex01.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx01 {
	// file 읽기 : FileInputStream
	// C:\DCOM_20220127\01_JAVA\workspace\J19\src\com\pcwk\ex01\fileinputstream\FileInputStreamEx01.java
	// C:\\DCOM_20220127\\01_JAVA\\workspace\\J19\\src\\com\\pcwk\\ex01\\fileinputstream\\input.txt
	// C:\\DCOM_20220127\\01_JAVA\\workspace\\J19\\src\\com\\pcwk\\ex01\\fileinputstream\\FileInputStreamEx01.java
	public static void main(String[] args) {
		String filePath = args[0];
		System.out.println("filePath : " + filePath);
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
			
			int data = 0;
			while((data = fis.read()) != -1) {
				char ch = (char)data;
				System.out.print(ch);
			}
			
		}catch(IOException e) {
			
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}