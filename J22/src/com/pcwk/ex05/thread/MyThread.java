package com.pcwk.ex05.thread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// 현재 수행 되고 있는 스레드 이름
			System.out.println("<" + Thread.currentThread().getName() + ">");
		}
		// 시간 지연
		for (int i = 0; i < 1_000_000; i++) {
			for (int j = 0; j < 1_000_000; j++) {

			}
		}
	}
}