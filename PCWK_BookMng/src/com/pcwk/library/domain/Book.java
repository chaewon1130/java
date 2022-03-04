package com.pcwk.library.domain;

import com.pcwk.cmn.DTO;

/**
 * <pre>
 * 도서정보
 * &#64;author ITSC
 * </pre>
 */
public class Book extends DTO {
	private String isbn; // 도서번호
	private String title; // 제목
	private String author; // 지은이
	private String genre; // 장르
	private boolean available; // 대출가능 여부

	// Default 생성자
	public Book() {
		super();
	}

	/**
	 * 생성자
	 * 
	 * @param isbn
	 * @param title
	 * @param author
	 * @param genre
	 * @param available
	 */
	public Book(String isbn, String title, String author, String genre, boolean available) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.available = available;
	}

	/**
	 * ISBN getter
	 * 
	 * @return
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * ISBN setter
	 * 
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", genre=" + genre + ", available="
				+ available + "]";
	}

}
