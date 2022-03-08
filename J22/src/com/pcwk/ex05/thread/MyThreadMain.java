package com.pcwk.ex05.thread;

public class MyThreadMain {

	public static void main(String[] args) {
		Runnable th01 = new MyThread();
		Thread thread01 = new Thread(th01, "thread01");
		thread01.setPriority(1); // MIN_PRIORITY
		System.out.println("thread01 우선순위 : " + thread01.getPriority());
		
		Thread thread02 = new Thread(th01, "thread02");
		thread02.setPriority(5); // NORM_PRIORITY, 생략하면 5
		System.out.println("thread02 우선순위 : " + thread02.getPriority());
		
		Thread thread03 = new Thread(th01, "thread03");
		thread03.setPriority(10); // NORM_PRIORITY
		System.out.println("thread03 우선순위 : " + thread03.getPriority());
		
		// 스레드 start
		thread03.start();
		thread02.start();
		thread01.start();
		
	}
}
//thread01 우선순위 : 1
//thread02 우선순위 : 5
//thread03 우선순위 : 10
//<thread03>
//<thread03>
//<thread03>
//<thread03>
//<thread03>
//<thread01>
//<thread01>
//<thread01>
//<thread01>
//<thread01>
//<thread02>
//<thread02>
//<thread02>
//<thread02>
//<thread02>