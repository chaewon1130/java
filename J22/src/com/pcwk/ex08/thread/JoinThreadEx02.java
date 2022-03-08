package com.pcwk.ex08.thread;

import java.util.ArrayList;

public class JoinThreadEx02 extends Thread {
	int seq;
	
	public JoinThreadEx02(int seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() {
		System.out.println(this.seq + " thread start");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(this.seq + " thread stop");
	}
	// join 사용
	// main()이 마지막에 종료 되도록 처리
	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			Thread thread = new JoinThreadEx02(i);
			thread.start();
			
			threads.add(thread);
		}
		// ArrayList<Thread> 스레드 join
		for(int i = 0; i < threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}
//0 thread start
//4 thread start
//3 thread start
//2 thread start
//1 thread start
//0 thread stop
//2 thread stop
//1 thread stop
//4 thread stop
//3 thread stop
//main end