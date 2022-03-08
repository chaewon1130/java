package com.pcwk.library.domain;

import com.pcwk.cmn.DTO;

public class Search extends DTO {

	private int searchDiv; // 검색구분, 전체(99), 제목(10), 저자(20)
	private String searchWord; // 검색어

	public Search() {

	}

	public Search(int searchDiv, String searchWord) {
		super();
		this.searchDiv = searchDiv;
		this.searchWord = searchWord;
	}

	public int getSearchDiv() {
		return searchDiv;
	}

	public void setSearchDiv(int searchDiv) {
		this.searchDiv = searchDiv;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	@Override
	public String toString() {
		return "Search [searchDiv=" + searchDiv + ", searchWord=" + searchWord + ", toString()=" + super.toString()
				+ "]";
	}
}
