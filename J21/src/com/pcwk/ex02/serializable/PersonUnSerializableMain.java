package com.pcwk.ex02.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonUnSerializableMain {

	public static void main(String[] args) {

		// 객체 역직렬화
		try (FileInputStream fis = new FileInputStream("serial.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person person01 = (Person) ois.readObject();
			Person person02 = (Person) ois.readObject();

			System.out.println("person01 : " + person01);
			System.out.println("person02 : " + person02);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("완료");
	}
}
//person01 : Person [name=홍길동, job=null]
//person02 : Person [name=이상무, job=null]
//완료