package com.pcwk.obj05.clone;

/**
 * 원 두개의 점과, 반지름 Object 클래스의 clone()은 단순히 인스턴스 변수의 값만을 복제하기 때문에 참조타입의 인스턴스 변수가
 * 있는 클래스는 완전히 복제가 이루어지지 않는다.
 * 
 * @author ITSC
 *
 */
public class Circle implements Cloneable {
	Point p; // 원점
	double r; // 반지름

	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	// 깊은 copy
	public Circle deepCopy() {
		Object obj = null;

		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		// Point 클래스의 멤버들을 copy
		Circle c = (Circle) obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;
	}

	// 얕은 copy
	public Circle clone() {
		Object obj = null;

		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 얕은 복사

		return (Circle) obj;
	}

	public String toString() {
		return "r : " + r + ", p = " + p.toString();
	}
}
