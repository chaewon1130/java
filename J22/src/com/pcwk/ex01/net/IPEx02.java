package com.pcwk.ex01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPEx02 {

	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress[] ipArr = null;

		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName : " + ip.getHostName());
			System.out.println("getHostAddress : " + ip.getHostAddress());
			ipArr = InetAddress.getAllByName("www.naver.com");
			for (int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr[" + i + "] : " + ipArr[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
//getHostName : www.naver.com
//getHostAddress : 223.130.195.200
//ipArr[0] : www.naver.com/223.130.195.200
//ipArr[1] : www.naver.com/223.130.200.107