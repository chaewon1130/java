package com.pcwk.oop05.inner;

public class Outer {
	class InstanceInner {
		int iv = 100;
	}

	static class StaticInner {
		int iv02 = 200;
		static int cv = 300;
	}

	void myMethod() {
		class LocalInner {
			int iv03 = 400;
		}
	}
}
