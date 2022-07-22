package com.rest_api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApi_Get {

	public static void main(String[] args) throws IOException {
	
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		Response response = request.get("/api/users?page=2");
		String asStr = response.asString();
		
//		Map<String, String> map = new HashMap<String,String>();
//		String[] entries = asStr.split(",");
//		for (String entry : entries) {
//			String[] keyValue = entry.split(",");
//			map.put(keyValue[0], keyValue[1]);
//		}
//		
//		System.out.println(map);
		
		File f = new File("F:\\summa\\rest_rep.txt");
		FileWriter writer = new FileWriter(f);
	
		String[] allWords = asStr.split(",");

		for (String word : allWords) {
				writer.write(word+"\n");
				System.out.println(word);
			}
		writer.close();	
		System.out.println("Writed");
		
	}

}
