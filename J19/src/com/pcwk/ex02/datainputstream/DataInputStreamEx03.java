package com.pcwk.ex02.datainputstream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx03 {

	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		try (FileInputStream fis = new FileInputStream("score.dat"); DataInputStream dis = new DataInputStream(fis);) {
			while (true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		} catch (EOFException e) { // 더 이상 읽을 데이터가 없으면 EOFException 발생시킨다.
			System.out.println("==================");
			System.out.println("=sum=" + sum);
			System.out.println("==================");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
//100
//90
//95
//85
//50
//==================
//=sum=420
//==================