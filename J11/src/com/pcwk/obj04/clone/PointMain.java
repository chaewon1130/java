package com.pcwk.obj04.clone;

public class PointMain {

	public static void main(String[] args) {
		Point orgPoint = new Point(11, 13);

		Point copyPoint = (Point) orgPoint.clone();
		
		// Point.toString() 오버라이드
		System.out.println(orgPoint.toString());
		// clone() 이후 멤버값
		System.out.println(copyPoint.toString());

	}
}