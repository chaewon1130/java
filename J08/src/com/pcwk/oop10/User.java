package com.pcwk.oop10;

public class User {
	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// setXXXX() : 값 멤버변수 Setting(세터)
	// getXXXX() : 값 멤버변수 가져오기(게터)

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if(age <= 0) {
			System.out.println("나이는 0보다 커야됩니다!");
			return;
		}
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
