package com.pcwk.ex07.thread;

public class NormThread implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.print("☆");
		}
	}
}