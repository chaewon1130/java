/**
 * 패키지 : com.pcwk.var01
 * 파일 : VariableImplicitConversion.java
 * 작성자 : ITSC
 */
package com.pcwk.var01;
public class VariableImplicitConversion {
/*
	묵시적 형변환
	작은 수에서 큰 수로, 덜 정밀한 수에서 더 정밀한 수로 대입 되는 경우
*/
	public static void main(String[] args) {
		byte bNum = 11;
		int iNum = bNum; // byte형 값이 int형으로 변환됨
		System.out.println("bNum = "+bNum);
		System.out.println("iNum = "+iNum);
		
		// 덜 정밀한 수에서 더 정밀한 수로 대입
		int iNum02 = 14;
		float fNum = iNum02;
		System.out.println("iNum02 = "+iNum02);
		System.out.println("fNum = "+fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println("fNum + iNum = "+dNum);
	}
}