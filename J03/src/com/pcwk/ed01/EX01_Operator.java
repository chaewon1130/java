package com.pcwk.ed01;

public class EX01_Operator {
	// � �� ������, ==, !=
	// ���ڿ��� �� equals()
	public static void main(String[] args) {
		double a = 3.14;
		double b = 5.14;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		
		String c01 = "Hello JAVA";
		// ���ڿ��� �� : ��ҹ��� ����
		System.out.println(c01.equals("Hello JAVA"));
		System.out.println(c01.equals("Hello java"));
	}
}