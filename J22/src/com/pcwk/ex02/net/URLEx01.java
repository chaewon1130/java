package com.pcwk.ex02.net;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class URLEx01 {

	public static void main(String[] args) {
		try {
			URL url = new URL(
					"http://sinchon.koreaisacademy.com/?dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022");
			// 호스트명과 포트번호
			System.out.println("호스트명 : " + url.getAuthority());
			System.out.println("포트번호 : " + url.getDefaultPort());
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("쿼리 : " + url.getQuery());
			System.out.println("전체 주소 : " + url.toURI());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
//호스트명 : sinchon.koreaisacademy.com
//포트번호 : 80
//프로토콜 : http
//쿼리 : dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022
//전체 주소 : http://sinchon.koreaisacademy.com/?dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022