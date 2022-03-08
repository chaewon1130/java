package com.pcwk.ex04.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 진행중 : " + i);
		}
	}
}