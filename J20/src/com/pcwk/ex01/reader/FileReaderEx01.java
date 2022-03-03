package com.pcwk.ex01.reader;

import java.io.FileReader;
import java.io.IOException;

import com.pcwk.cmn.LoggerManager;

public class FileReaderEx01 implements LoggerManager {

	public static void main(String[] args) {
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex01\\reader\\reader.txt";
		// 2byte단위로 읽어서 한글, 한자 등 깨지지 않음
		try (FileReader fr = new FileReader(filePath)) {
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			LOG.debug("==============");
			LOG.debug(e.getMessage());
			LOG.debug("==============");
		}
		System.out.println("\n프로그램 종료");
	}
}
//안녕하세요.
//좋은 아침!
//프로그램 종료