package com.pcwk.ex02.serializable;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2160892108411219765L;

	/**
	 * Server/Client 클래스의 동일성 check
	 */
	String name;

	// 직렬화 대상에서 제거
	transient String job;

	public Person() {

	}

	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}

}