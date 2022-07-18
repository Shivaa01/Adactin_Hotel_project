package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjManager {

	public static WebDriver driver;
	
	private LoginPage lp;
	private SearchOneHotel_Page shOne;
	private SearchTwoHotell_Page shTwo;
	private BookHotel_Page bkHotel;
	private BookinConfirm_Page bkConfirm;
	private BookedItinerary_Page bkItems;
	
	
	
	public PageObjManager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	
	
	
	public LoginPage getLp() {
		LoginPage lp = new LoginPage(driver);
		return lp;
	}
	
	public SearchOneHotel_Page getShOne() {
		SearchOneHotel_Page shOne = new SearchOneHotel_Page(driver);
		return shOne;
	}
	
	public SearchTwoHotell_Page getShTwo() {
		SearchTwoHotell_Page shTwo = new SearchTwoHotell_Page(driver);
		return shTwo;
	}

	public BookHotel_Page getBkHotel() {
		BookHotel_Page bkHotel = new BookHotel_Page(driver);
		return bkHotel;
	}

	public BookinConfirm_Page getBkConfirm() {
		BookinConfirm_Page bkConfirm = new BookinConfirm_Page(driver);
		return bkConfirm;
	}
	
	
	
	
	
	
}
