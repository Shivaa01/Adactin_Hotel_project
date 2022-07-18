package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchOneHotel_Page {
	
	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;		
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(id = "room_nos")
	private WebElement roomNos;
	
	@FindBy(id = "datepick_in")
	private WebElement checkIn;
	
	@FindBy(id = "datepick_out")
	private WebElement checkOut;
	
	@FindBy(id = "adult_room")
	private WebElement adultNroom;
	
	@FindBy(id = "child_room")
	private WebElement childNroom;
	
	@FindBy(id = "Submit")
	private WebElement submit;
	
	@FindBy(id = "Reset")
	private WebElement reset;

	public SearchOneHotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultNroom() {
		return adultNroom;
	}

	public WebElement getChildNroom() {
		return childNroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getReset() {
		return reset;
	}
	
	
	
	
	
	
}
