package com.pcwk.ex07.naverapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class NaverSearchEx01 {
	public static void main(String[] args) {
		// 클라이언트 ID
		String clientId = "w7CZy4kWb13gklCaYPPz";
		// 클라이언트 secret
		String clientSecret = "D0GPTIhYIe";

		if(args.length != 1) {
			System.out.println("검색어를 입력하세요");
			System.exit(0);
		}
		
		// 검색어
		String text = args[0];
		BufferedReader br = null;

		try {
			text = URLEncoder.encode(text, "UTF-8");
			System.out.println("text : " + text);
			// 블로그 JSON
//			String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text;
			// 책 JSON
//			String apiURL = "https://openapi.naver.com/v1/search/book.json?query=" + text;
			// 책 XML
//			String apiURL = "https://openapi.naver.com/v1/search/book.xml?query=" + text;
			// 뉴스
			String apiURL = "https://openapi.naver.com/v1/search/news.json?query=" + text;
			System.out.println("apiURL : " + apiURL);

			URL url = new URL(apiURL); // URL

			// clientId, clientSecret 적용을 위한 HttpURLConnection
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET"); // GET 방식으로 접근
			con.setRequestProperty("X-Naver-Client-Id", clientId); // clientId
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret); // clientSecret

			// 200 : 성공
			// 401 : 인증실패
			int responseCode = con.getResponseCode();
			System.out.println("responseCode : " + responseCode);
			// 성공
			if (responseCode == 200) {
				// byte스트림을 char스트림으로 연결 하고 BufferedReader 생성
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				// 가지고 온 데이터 출력
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} else {
				// 실패
				System.out.println("클라이언트 아이디, 클라이언트 시크릿을 확인하세요.");
				return;
			}

		} catch (IOException e) {
			System.out.println("=========================");
			System.out.println("=IOException=" + e.getMessage());
			System.out.println("=========================");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
//{
//"lastBuildDate": "Thu, 03 Mar 2022 15:15:10 +0900",
//"total": 755841,
//"start": 1,
//"display": 10,
//"items": [
//{
//"title": "<b>자바</b>학원 효과적으로 배우고 싶다면!",
//"link": "https:\/\/blog.naver.com\/ssoyeon12?Redirect=Log&logNo=222648861125",
//"description": "<b>자바</b>에 관해서 배우고 싶다는 생각을 하게 되었는데요. 원래는 제약회사 영업직으로 일하고 있었기에, 코딩에 대해서는 잘 모르는 상태였어요. 그렇지만, 더 늦기 전에 배워보고 싶다는 마음이 들어 <b>자바</b>학원... ",
//"bloggername": "요롱일상",
//"bloggerlink": "https://blog.naver.com/ssoyeon12",
//"postdate": "20220216"
//
//},