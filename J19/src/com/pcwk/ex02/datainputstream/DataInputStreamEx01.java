package com.pcwk.ex02.datainputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamEx01 {

	public static void main(String[] args) {
		// DataOutputStream 기록
		// 16진수로 출력
		try (FileOutputStream fos = new FileOutputStream("sample.dat");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("DataOutputStream");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// DataInputStream으로 읽기
		// 순서, type으로 다시 읽어야 한다.
		try (FileInputStream fis = new FileInputStream("sample.dat"); DataInputStream dis = new DataInputStream(fis)) {
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("종료");
	}
}
//100
//A
//10
//3.14
//DataOutputStream
//종료