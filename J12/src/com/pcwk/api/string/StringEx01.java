package com.pcwk.api.string;

import org.apache.log4j.Logger;

public class StringEx01 {
	final static Logger LOG = Logger.getLogger(StringEx01.class);

	public static void main(String[] args) {
//		LOG.debug("====================");
//		LOG.debug("=log4j=");
//		LOG.debug("====================");

		String fullName = "Hello.java";
		// "." 위치 : indexOf, lastIndex
		// index 시작은 0부터, 왼쪽에서 오른쪽으로
//		int index = fullName.indexOf(".");
//		LOG.debug("index : " + index);

		int index = fullName.lastIndexOf(".");
		LOG.debug("index : " + index);

		// substring()
		// 해당위치 부터 문자열 끝까지 출력
		// +1 하는 것은 점을 제외하기 위해
		String ext = fullName.substring(index + 1);
		LOG.debug("ext : " + ext);

		// 파일명(확장자 제외)
		// 0은 포함, 마지막위치는 미포함
		// 0 <= x <= index
		String fileName = fullName.substring(0, index);
		LOG.debug("filename : " + fileName);
		LOG.debug("=====================");
		// Hello.java -> GoodMorning.java
		// replace(old, new)
		String replaceStr = fullName.replace("Hello", "GoodMorning");
		LOG.debug(replaceStr);
	}

}
