package com.pcwk.ex02.datainputstream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx02 {
	// sum, 평균
	public static void main(String[] args) {
		int[] score = { 100, 90, 95, 85, 50 };
		try (FileOutputStream fos = new FileOutputStream("score.dat");
				DataOutputStream dos = new DataOutputStream(fos)) {
			for (int i : score) {
				dos.writeInt(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("score.dat 생성완료!");
	}
}