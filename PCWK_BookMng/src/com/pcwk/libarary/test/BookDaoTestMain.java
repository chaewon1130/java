package com.pcwk.libarary.test;

import com.pcwk.library.dao.BookDao;
import com.pcwk.library.domain.Book;

public class BookDaoTestMain {

	BookDao dao;
	Book book01;
	Book book02;
	Book book03;

	public BookDaoTestMain() {
		dao = new BookDao();
		book01 = new Book("1163032212-9791163032212-99", "Do it! HTML+CSS+<b>자바</b>스크립트 웹 표준의 정석_99", "고경희_99", "IT_99",
				true);
		book02 = new Book("1163032212-9791163032212-999", "Do it! HTML+CSS+<b>자바</b>스크립트 웹 표준의 정석_999", "고경희_999",
				"IT_999", true);
		book03 = new Book("1163032212-9791163032212-99999", "Do it! HTML+CSS+<b>자바</b>스크립트 웹 표준의 정석_99999", "고경희_99999",
				"IT_99999", true);

	}

	public void saveFile() {
		int writeCnt = dao.saveFile("booksTmp.csv");
		System.out.println("writeCnt : " + writeCnt);
	}

	public void readFile() {
		for (Book b : dao.bookList) {
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		BookDaoTestMain bookMain = new BookDaoTestMain();
		bookMain.readFile(); // 파일에서 읽기
		bookMain.saveFile(); // 파일로 쓰기
	}
}