package com.pcwk.libarary.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

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
	
	// Scanner 통한 데이터 입력
	public Book getInputData(Scanner scanner) {
		Book book = null;
		
		String readInput = scanner.nextLine().trim();

		String[] dataArr = readInput.split(",");

		boolean available = false;
		available = dataArr[4].equals("1") ? true : false;
		book = new Book(dataArr[0], dataArr[1], dataArr[2], dataArr[3], available);
		
		return book;
	}

	public static void main(String[] args) {
		BookDaoTestMain bookMain = new BookDaoTestMain();
//		bookMain.readFile(); // 파일에서 읽기
//		bookMain.saveFile(); // 파일로 쓰기

		// books.csv 존재여부 체크
		File books = new File(BookDao.SAVE_FILE_PATH);

		// 파일이 존재하지 않고, 파일이 아니면
		if (!books.exists() || !books.isFile()) {
			try {
				books.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// CRUDQ
		// C(등록), R(조회), U(수정), D(삭제), Q(종료)

		// ==========================================================
		// Keyboard Input 처리
		// ==========================================================
		Scanner scanner = new Scanner(System.in);
		String inCommand = ""; // 명령어 입력
		do {
			System.out.print("C(등록), R(조회), U(수정), D(삭제), Q(종료), RE(전체조회)>>");
			inCommand = scanner.nextLine();
			inCommand = inCommand.trim(); // 앞뒤 공백제거

			Book book = null;
			String[] dataArr = null;
			String readInput = "";
			switch (inCommand.toUpperCase()) {
			case "RE": // 전체 조회
				System.out.println("=================================");
				System.out.println("도서번호\t\t제목\t\t지은이\t\t장르\t\t대출가능 여부");
				System.out.println("=================================");
				List<Book> list = bookMain.dao.doRetrieve(book);
				for(Book b : list) {
					System.out.println(b.getIsbn() + ", " + b.getTitle() + ", " + b.getAuthor() + ", " + b.getGenre() + ", " + b.isAvailable());
				}
				break;
			case "U":
				System.out.println("수정 : 8994492046-9788994492049,Java의 정석 기초편,남궁성,IT,1>>");
				book = bookMain.getInputData(scanner);
				
				// ArrayList 수정
				// 1. 수정 데이터가 있는지 확인
				// 2. 기존 데이터 삭제
				// 3. 수정 데이터 등록
				
				if(bookMain.dao.isBookExists(book) != 1) {// 기존데이터가 있는가
					System.out.println("데이터가 존재 하지 않습니다.\n데이터를 확인해 주세요.");
					continue;
				}
				int uStatus = bookMain.dao.doUpdate(book);
				if(uStatus == 2) {
					System.out.println("수정 성공!");
				}else {
					System.out.println("수정 실패!");
				}
//				System.out.println("U : input : " + book);
				break;
				
			case "R": // 단건 조회
				// 화면에서 도서번호를 입력을 받는다.
				// 북 객체를 만든다
				System.out.println("조회 도서번호 : 8994492046-9788994492049>>");
				readInput = scanner.nextLine().trim();
				book = new Book();
				book.setIsbn(readInput);
				
				Book outData = bookMain.dao.doSelectOne(book);
				if(outData == null) {
					System.out.println("조회 실패!");
				}else {
					System.out.println("조회 성공!");
					System.out.println("조회 데이터 : " + outData);
				}
				break;
			case "D": // 삭제
				System.out.println("삭제 도서번호 : 8994492046-9788994492049>>");
				readInput = scanner.nextLine().trim(); // 입력데이터 받기
				book = new Book();
				book.setIsbn(readInput); // 삭제 도서번호
				
				int status = bookMain.dao.doDelete(book);
				if(status == 1) {
					System.out.println("삭제 되었습니다.");
				}else {
					System.out.println("삭제 실패!");
				}
				break;
			case "C": // 등록
				System.out.println("입력 : 8994492046-9788994492049,Java의 정석 기초편,남궁성,IT,1>>");
				book = bookMain.getInputData(scanner);
				
				int statusC = bookMain.dao.doSave(book);
				if (statusC == 1) { // 정상 등록
					System.out.println(book.toString() + " 입력 되었습니다.");
				}else{ 
					System.out.println("등록 실패!");
				}
				break;
			case "Q": // 종료 : 메모리 to file
				int flag = bookMain.dao.saveFile(BookDao.SAVE_FILE_PATH);
				System.out.println("저장건수 : " + flag);
				break;
			default:
				System.out.println("C(등록), R(조회), U(수정), D(삭제), Q(종료)\n명령어를 확인 하세요.");
				break;
			}
		} while (!inCommand.equalsIgnoreCase("Q"));

		System.out.println("===================================");
		System.out.println("= 프로그램 종료! =");
		System.out.println("===================================");

	}
}