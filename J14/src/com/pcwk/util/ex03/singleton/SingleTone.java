package com.pcwk.util.ex03.singleton;

public class SingleTone {
	
	private static SingleTone singleTone;
	
	// 생성자는 private
	private SingleTone() {
		
	}
	// 객체 생성용 static 메소드
	public static SingleTone getInstance() {
		
		if(singleTone == null) {
			singleTone = new SingleTone();
		}
		return singleTone;
	}
}
