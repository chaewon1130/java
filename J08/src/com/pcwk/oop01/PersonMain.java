package com.pcwk.oop01;

public class PersonMain {

	public static void main(String[] args) {
		// The constructor Person() is undefined
		// 인자있는 생성자를 만들면 JVM은 default 생성자는 만들지 않는다.
		Person person = new Person();
		System.out.println(person.name);
	}
}