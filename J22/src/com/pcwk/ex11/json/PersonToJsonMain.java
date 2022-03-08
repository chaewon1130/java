package com.pcwk.ex11.json;

import com.google.gson.Gson;

public class PersonToJsonMain {

	public static void main(String[] args) {
		// Java Class -> json string
		Person person = new Person("철수", 9, "남");
		
		//{"name":"철수","age":9,"gender":"남"}
		Gson gson = new Gson();
		String jsonString = gson.toJson(person);
		System.out.println(jsonString);
	}
}