package com.pcwk.ex01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPEx01 {

	public static void main(String[] args) {
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getLocalHost();
			// 호스트 이름을 출력
			System.out.println("getHostName : " + ip.getHostName());
			
			// 호스트 주소를 출력
			System.out.println("getHostAddress : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
//getHostName : DESKTOP-ONE4R81
//getHostAddress : 192.168.3.23