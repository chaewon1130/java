package com.pcwk.oop07;

public class Point3D extends Point {
	int z;

	public Point3D(int x, int y, int z) {
		// super() 자동으로 호출
		super(x, y);
//		this.x = x;
//		this.y = y;
		this.z = z;
	}
	
	@Override // 아버지의 getLocation() 재정의
	public String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}
