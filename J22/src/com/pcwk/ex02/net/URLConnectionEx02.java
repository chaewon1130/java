package com.pcwk.ex02.net;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnectionEx02 {

	public static void main(String[] args) {
		URL url = null;
		String address = "http://sinchon.koreaisacademy.com/?dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022";

		BufferedReader input = null;
		FileWriter fw = null;
		try {
			url = new URL(address);
			// 버퍼(byte 스트림을 char(InputStream))
			// 사이트가 euc-kr로 되어있음
			input = new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"));
			fw = new FileWriter("index2.html");
			String line = "";

			// index.html
			while ((line = input.readLine()) != null) {
				System.out.println(line);
				fw.write(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}