package com.pcwk.ex09.thread;

// 계좌, 출금
public class Account {
	private int balance = 1_000;

	public int getBalance() {
		return balance;
	}

	// 출금
	public void withdraw(int money) {
		if (balance >= money) { // 잔고 >= 출금액
			try {
				Thread.sleep(1000);

				balance -= money; // 잔고 = 잔고 - 출금액
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}