package com.pcwk.var01;

public class Variable01 {
	public static void main(String[] args) {
//		int num = 12345678900; // int �����ʰ�
//		long num = 12345678900; // int �����ʰ�
		long num = 12345678900l;
		
		System.out.println(num);
		
		/*
		 ���ڵ� - �� ���ڿ� ���� Ư���� ���ڰ�(�ڵ� ��)�� �ο�
		 ���ڵ� - ���ڰ�(�ڵ尪)�� ������ ���ڷ� ��ȯ
		 
		 ���� ��Ʈ : �ڵ� ���� ��� �� ��
		 ASCII(American Standard Code for Information Interchange)
		 �ƽ�Ű : 1����Ʈ�� ������, ����, Ư������ ���� ǥ�� ��
		 �����ڵ�(UNICODE) : �ѱ۰� ���� ������ �� ǥ��
		 ���ڸ� ������ �����ϸ�, ���ڿ� �ش��ϴ� �ڵ� ���� �����
		 �ڹٴ� UTF-16 ���ڵ��� ����Ѵ�
		*/
		char c1 = 126;
		char c2 = '\uAC03';
		System.out.println(c1); // ~
		System.out.println(c2);	// �B
		
		/*
		 �Ǽ� �ڷ��� : float(4����Ʈ), double(8����Ʈ)
		 �ε� �Ҽ��� ��� : �Ǽ��� �����ο� �����η� ǥ��, ������ �Ǽ��� ǥ���ϱ� ���� ���
		 
		 ���� : boolean
		 ���� true / false�� ǥ���ϴ� �ڷ���
		 
		*/
		
		
	}
}