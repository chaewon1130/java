package com.pcwk.oop03;

public class InheritanceMain {

	public static void main(String[] args) {
		Student student = new Student(); // 학생 인스턴스
		student.breath(); // Person의 breath() 메소드 호출
		student.learn();
		
		System.out.println("=========");

		Teacher teacher = new Teacher();
		teacher.eat(); // Person의 eat() 메소드 호출
		teacher.teach();
	}
}