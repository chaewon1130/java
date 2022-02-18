package com.pcwk.api.crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import com.pcwk.api.string.LoggerManager;

public class CGVParseMain implements LoggerManager{

	public static void main(String[] args) {
		String url = "http://www.cgv.co.kr/movies/?lt=1&ft=0";
		
		try {
			Document doc = Jsoup.connect(url).get();
//			LOG.debug("-----------------------------------------");
//			LOG.debug(doc);
//			LOG.debug("-----------------------------------------");
			
			// 제목
			// html 태그 구분자 space
			// html css 구분자 .
			Elements titles = doc.select("div.box-contents strong.title");

			// 예매율
			Elements reservRatios = doc.select("div.score strong.percent span");
						
			// 개봉일
			Elements openRuns = doc.select("span.txt-info strong");
			
			// 포스터
			Elements posters = doc.select("span.thumb-image img");
			
			
			for(int i=0; i<7; i++) {
				Element titleElement = titles.get(i);
				Element reservElement = reservRatios.get(i);
				Element openElement = openRuns.get(i);
				String poster = posters.get(i).attr("src");
				LOG.debug((i+1) + ". " + titleElement.text()
				+ ", 예매율 : " + reservElement.text()
				+ ", 개봉일 : " + openElement.text().replace("개봉", "")
				+ ", 포스터 : " + poster);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}