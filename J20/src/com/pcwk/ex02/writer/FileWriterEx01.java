package com.pcwk.ex02.writer;

import java.io.FileWriter;
import java.io.IOException;

import com.pcwk.cmn.LoggerManager;

public class FileWriterEx01 implements LoggerManager {

	// 특수 문자
	// \n : 라인스킵
	// \r : 케리지 return
	// \t : tab문자
	// ' ' : space문자
	public static void main(String[] args) {
		// try-with-resource
		try (FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('B');
			// good morning
			char[] buf = { ' ', 'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g' };
			fw.write(buf);
			String msg = "\n 좋은 아침!";
			fw.write(msg);
			fw.write('\n');
			fw.write(buf, 1, 10);
		} catch (IOException e) {
			LOG.debug("==============");
			LOG.debug(e.getMessage());
			LOG.debug("==============");
		}
		LOG.debug("프로그램 종료!");
	}
}