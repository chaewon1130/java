package com.pcwk.ex01.fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx02 {

	public static void main(String[] args) {
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J19\\src\\com\\pcwk\\ex01\\fileinputstream\\FileInputStreamEx02.java";
		
		// try-with resource
		try(FileInputStream fis = new FileInputStream(filePath);
				FileOutputStream fos = new FileOutputStream("output.java")) {
			
			int data = 0;
			while((data = fis.read()) != -1) {
				char ch = (char)data;
				System.out.print(ch);
				//==========FileinputStream============
				fos.write(data);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료!");
	}
}