package com.helperfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties p;
	public ConfigReader() throws IOException {
	
		File f = new File("F:\\eclipseWorkSpace\\AdacCucum\\src\\main\\java\\com\\helperfile\\Config.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String get_Url() {
		String url = p.getProperty("url");
		return url;
	}
	public String get_Uname() {
		String uname = p.getProperty("username");
		return uname;
	}
	public String get_Pass() {
		String pass = p.getProperty("password");
		return pass;
	}
	
	
	
	public String get_fName() {
		String fname = p.getProperty("fname");
		return fname;
	}
	public String get_lName() {
		String lname = p.getProperty("lname");
		return lname;
	}
	public String get_Address() {
		String addr = p.getProperty("address");
		return addr;
	}
	public String get_ccNum() {
		String ccnum = p.getProperty("ccnum");
		return ccnum;
	}
	public String get_cvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	
}
