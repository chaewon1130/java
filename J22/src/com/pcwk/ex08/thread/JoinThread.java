package com.pcwk.ex08.thread;

public class JoinThread extends Thread {
	int seq;
	
	public JoinThread(int seq) {
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
	// join 미사용
	// 다른 스레드가 끝나기 전에 main() 종료
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			Thread thread = new JoinThread(i);
			thread.start();
		}
		System.out.println("main end");
	}
}
//0 thread start
//4 thread start
//main end
//3 thread start
//2 thread start
//1 thread start
//1 thread stop
//0 thread stop
//2 thread stop
//3 thread stop
//4 thread stop