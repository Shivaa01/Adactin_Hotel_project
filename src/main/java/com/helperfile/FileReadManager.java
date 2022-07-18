package com.helperfile;

import java.io.IOException;

public class FileReadManager {

	//private
	private FileReadManager() {
		
	}
	
	//public static
	public static FileReadManager getInsta_FRM() {
		FileReadManager frm = new FileReadManager();
		return frm;
	}
	
	//constructor
	public ConfigReader getInsta_CR() throws IOException {
		ConfigReader reader = new ConfigReader();
		return reader;
	}
	
	
	
}
