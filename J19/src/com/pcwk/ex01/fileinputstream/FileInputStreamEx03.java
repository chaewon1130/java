package com.pcwk.ex01.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx03 {
	// byte[] read
	public static void main(String[] args) {
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J19\\src\\com\\pcwk\\ex01\\fileinputstream\\input2.txt";

		System.out.println("filePath" + filePath);

		try (FileInputStream fis = new FileInputStream(filePath)) {
			byte[] bs = new byte[26];
			int i = 0;
			while ((i = fis.read(bs)) != -1) {
				for (byte b : bs) {
					System.out.print((char) b);
				}
//				System.out.println(" : " + i + "byte 읽음");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}