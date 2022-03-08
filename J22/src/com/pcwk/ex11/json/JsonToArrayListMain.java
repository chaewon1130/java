package com.pcwk.ex11.json;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonToArrayListMain {

	public static void main(String[] args) {
		String jsonString = "[\r\n"
				+ "    {\r\n"
				+ "        \"name\": \"철수\",\r\n"
				+ "        \"age\": 9,\r\n"
				+ "        \"gender\": \"남\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "        \"name\": \"영희\",\r\n"
				+ "        \"age\": 9,\r\n"
				+ "        \"gender\": \"여\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "        \"name\": \"짱구\",\r\n"
				+ "        \"age\": 9,\r\n"
				+ "        \"gender\": \"남\"\r\n"
				+ "    }\r\n"
				+ "]";
		
		Gson gson = new Gson();
		Type type = new TypeToken<ArrayList<Person>>() {}.getType();
		// jsonString Person 배열 => List<Person>
		ArrayList<Person> list  = gson.fromJson(jsonString, type);
		
		for(Person p : list) {
			System.out.println(p);
		}
	}
}
//Person [name=철수, age=9, gender=남]
//Person [name=영희, age=9, gender=여]
//Person [name=짱구, age=9, gender=남]