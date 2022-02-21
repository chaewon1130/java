package com.pcwk.util.ex01.currenttime;

import com.pcwk.cmn.LoggerManager;

public class Date01Main implements LoggerManager {

//	System.currentTimeMillis();
//	현재 운영체제의 시각을 long타입으로 반환(1970.01.01 기준으로 현재까지의 경과 시간 1/1000초까지 단위 환산)

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		LOG.debug("시작시간 : " + start);

		for (int i = 1; i < 10000000; i++) {
			for (int j = 1; j < 10000000; j++) {

			}
		}

		long end = System.currentTimeMillis();
		LOG.debug("종료시간 : " + end);
		LOG.debug("경과시간 : " + (end - start) + "ms");

	}
}
