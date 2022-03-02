package com.pcwk.ex03.buffer;

import java.io.FileInputStream;
import java.io.IOException;

public class NoneBufferInputStreamEx01 {

	public static void main(String[] args) {
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J19\\big_output03.txt";
		System.out.println("filePath : " + filePath);
		long start = System.currentTimeMillis();
		try (FileInputStream fis = new FileInputStream(filePath)) {
			int data = 0;
			while ((data = fis.read()) != -1) {
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("==============");
		System.out.println("경과시간 : " + (end - start) + "ms");
		System.out.println("종료!");
		System.out.println("==============");
	}
}
//==============
//경과시간 : 3746ms
//종료!
//==============