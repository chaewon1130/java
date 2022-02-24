package com.pcwk.time.ex07.generics;

public class GenericPrintMain {

	public static void main(String[] args) {
		// Powder type GenericPrint 생성
//		GenericPrint<Powder> powderPrinter = new GenericPrint<>();
		// Powder getXXX(), setXXX()
		GenericPrint<Powder> powderPrinter = new GenericPrint<Powder>();
		
		// setMaterial
		powderPrinter.setMaterial(new Powder());
		
		// getMaterial
		Powder powder = powderPrinter.getMaterial();
		System.out.println("powder : " + powder);
		
		// 재료는 Powder 입니다.
		System.out.println(powderPrinter.toString());
		
		// Plastic getXXX(), setXXX()
		GenericPrint<Plastic> plasticPrinter = new GenericPrint<>();
		
		plasticPrinter.setMaterial(new Plastic());
		
		System.out.println(plasticPrinter);
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println("plastic : " + plastic); // plastic.toString()
	}
}