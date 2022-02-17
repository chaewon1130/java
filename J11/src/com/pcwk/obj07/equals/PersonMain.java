package com.pcwk.obj07.equals;

public class PersonMain {

	public static void main(String[] args) {
		Person p01 = new Person(1234567890);
		Person p02 = new Person(1234567890);
		
		if(p01.equals(p02)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}
}