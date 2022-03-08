package com.pcwk.ex09.thread;

public class NoneSyncMain {

	public static void main(String[] args) {
		Runnable runnable01 = new RunnableEx01();

		Thread t01 = new Thread(runnable01);
		Thread t02 = new Thread(runnable01);

		t01.start();
		t02.start();
	}
}
//balance : 700
//balance : 700
//balance : 500
//balance : 500
//balance : 200
//balance : 200
//balance : 200
//balance : 0
//balance : -200