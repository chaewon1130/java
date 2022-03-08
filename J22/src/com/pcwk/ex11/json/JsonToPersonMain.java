package com.pcwk.ex11.json;

import com.google.gson.Gson;

public class JsonToPersonMain {

	public static void main(String[] args) {
		String jsonString = "{\"name\":\"철수\",\"age\":9,\"gender\":\"남\"}";
		Gson gson = new Gson();
		Person person = gson.fromJson(jsonString, Person.class);
		// Person [name=철수, age=9, gender=남]
		System.out.println(person.toString());
		
	}
}