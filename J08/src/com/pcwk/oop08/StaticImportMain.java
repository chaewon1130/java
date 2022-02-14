package com.pcwk.oop08;

import static com.pcwk.oop08.Card.WIDTH;
// import java.lang.*
// JVM이 넣어줌!
import static java.lang.Math.random;
import static java.lang.System.out;

public class StaticImportMain {

	public static void main(String[] args) {
		out.println("Card.WIDTH : " + Card.WIDTH);
		out.println("WIDTH : " + WIDTH);
		out.println("random : " + random());
		
		System.out.println();
		
	}
}