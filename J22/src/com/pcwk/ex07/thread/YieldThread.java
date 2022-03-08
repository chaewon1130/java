package com.pcwk.ex07.thread;

public class YieldThread implements Runnable {
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			// 자음 + 한자
			System.out.print("★");
			Thread.yield();
		}
	}
}