package com.pcwk.oop07;

public class Point extends Object{
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * x좌표, y좌표
	 * 
	 * @return x,y좌표
	 */
	public String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}
