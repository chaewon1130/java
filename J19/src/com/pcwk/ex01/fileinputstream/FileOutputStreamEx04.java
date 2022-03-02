package com.pcwk.ex01.fileinputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx04 {

	public static void main(String[] args) {
		// 기존 파일에 내용을 추가
		// new FileOutputStream("output02.txt", true)
		try (FileOutputStream fos = new FileOutputStream("output02.txt", true)) {
			fos.write(97); // a
			fos.write(98); // b
			fos.write(99); // c
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("종료");
	}
}