package com.pcwk.var01;

public class VariableCasting06 {
	/*
		명시적 형변환 : 묵시적 형변환의 반대의 경우
		변환되는 자료형을 명시해야 함. 자료의 손실이 발생 할 수 있다.
	*/
	public static void main(String[] args) {
		// 큰 수를 작은 변수에 할당
		int iNum = 11;
		byte bNum = (byte)iNum;
		
		System.out.println("iNum = "+iNum);
		System.out.println("bNum = "+bNum);
		
		int iNum01 = 1000;
		byte bNum01 = (byte)iNum01;
		System.out.println("iNum01 = "+iNum01);
		System.out.println("bNum01 = "+bNum01); // 쓰레기 값
		
		// 더 정밀한 자료형에서 덜 정밀한 변수로 대입
		double dNum02 = 3.14;
		int iNum02 = (int)dNum02;
		System.out.println("dNum02 = "+dNum02);
		System.out.println("iNum02 = "+iNum02);
	}
}