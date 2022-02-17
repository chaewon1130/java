package com.pcwk.obj05.clone;

// implements Cloneable 없으면
// 예외 발생!
public class Point implements Cloneable {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x : " + x + ", y : " + y;
	}

	@Override
	public Object clone() {
		Object obj = null;

		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}
}
