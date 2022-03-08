package com.pcwk.ex04.thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("MyRunnable 진행 중 : " + i);
		}
	}

}
