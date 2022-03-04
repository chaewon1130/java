package com.pcwk.ex01.file;

public class ExtMain {

	public static void main(String[] args) {
		String fileName = "FileE.java";
		int idx = fileName.lastIndexOf(".");
		System.out.println(idx);

		String ext = fileName.substring(idx + 1);
		System.out.println(ext);
	}
}