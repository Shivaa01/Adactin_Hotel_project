package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookinConfirm_Page {
	
	public static WebDriver driver;
	
	@FindBy(id = "search_hotel")
	private WebElement Search;
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement myItinerary;
	
	@FindBy(id = "logout")
	private WebElement logOut;
	
	public BookinConfirm_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getLogOut() {
		return logOut;
	}
	
	
}
