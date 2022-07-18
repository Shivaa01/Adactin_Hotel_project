package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary_Page {

	public static WebDriver driver;
	
	@FindBy(name = "ids[]")
	private WebElement slectionBox;
	
	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancelSelected;
	
	@FindBy(id = "search_hotel")
	private WebElement Search;
	
	@FindBy(id = "logout")
	private WebElement logOut;

	public BookedItinerary_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSlectionBox() {
		return slectionBox;
	}

	public WebElement getCancelSelected() {
		return cancelSelected;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getLogOut() {
		return logOut;
	}
	
}
