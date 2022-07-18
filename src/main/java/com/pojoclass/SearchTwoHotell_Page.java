package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchTwoHotell_Page {

	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement selectRad;
	
	@FindBy(id = "continue")
	private WebElement contiNue;
	
	@FindBy(id = "cancel")
	private WebElement caNcel;
	
	public SearchTwoHotell_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectRad() {
		return selectRad;
	}

	public WebElement getContiNue() {
		return contiNue;
	}

	public WebElement getCaNcel() {
		return caNcel;
	}
	
	
	
}
