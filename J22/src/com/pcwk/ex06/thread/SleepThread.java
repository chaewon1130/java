package com.pcwk.ex06.thread;

public class SleepThread extends Thread {
	// sleep() block효과를 이용해 카운트 다운
	@Override
	public void run() {
		System.out.println("카운트 다운 10초!");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);

			if (i != 0) {
				try {
					// 지정된 시간동안 스레드를 일시 정지 시킨다.
					// 지정된 시간이 지나고 나면, 자동적으로 실행 대기상태가 된다.
					Thread.sleep(1000);// 0.001초
				} catch (InterruptedException e) {
					System.out.println(e.getMessage() + ", " + e.toString());
				}
			}
		}
		System.out.println("종료");
	}
}