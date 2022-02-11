package com.pcwk.oop01;

public class Student {
	// 속성
	int studentId; // 학번
	String name; // 이름
	int grade; // 학년
	String address; // 주소
	
	// 메소드
	void showStudentInfo() {
		System.out.println(studentId + " " + name);
		System.out.println(grade + " " + address);
	}
}
