package com.pcwk.oop01;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "이상무";
		student.studentId = 20123456;
		student.grade = 4;
		student.address = "서울특별시 마포구 서강로 136 아이비타워 2층";
		
		student.showStudentInfo();
	}
}