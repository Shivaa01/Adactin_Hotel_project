package com.AdacCucum;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.basclass.BaseClass;
import com.helperfile.FileReadManager;
import com.pojoclass.PageObjManager;

public class AdacCucum extends BaseClass {

	public static void main(String[] args) throws IOException, AWTException {
		
		driver = getBrowser("chrome");
		
		PageObjManager pom= new PageObjManager(driver);
		
		getUrl(FileReadManager.getInsta_FRM().getInsta_CR().get_Url());
		
		inputKeys(pom.getLp().getUsername(), FileReadManager.getInsta_FRM().getInsta_CR().get_Uname());
		inputKeys(pom.getLp().getPassword(), FileReadManager.getInsta_FRM().getInsta_CR().get_Pass());
		click(pom.getLp().getLoginBtn());
// SearchOneHotel
		dropDown(pom.getShOne().getLocation(), "bytext", "London");	
		dropDown(pom.getShOne().getHotels(), "byindex", "2");
		dropDown(pom.getShOne().getRoomType(), "bytext", "Deluxe");
		dropDown(pom.getShOne().getRoomNos(), "byvalue", "1");
		inputKeys(pom.getShOne().getCheckIn(), "10/08/2022");
		inputKeys(pom.getShOne().getCheckOut(), "13/08/2022");
		dropDown(pom.getShOne().getAdultNroom(), "byvalue", "2");
		dropDown(pom.getShOne().getChildNroom(), "byindex", "0");
		click(pom.getShOne().getSubmit());
//SearchTwoHotel
		radioBtn(pom.getShTwo().getSelectRad());
		click(pom.getShTwo().getContiNue());
//BookHotel
		keyPress("pagedown");
		inputKeys(pom.getBkHotel().getFirstName(), FileReadManager.getInsta_FRM().getInsta_CR().get_fName());
		inputKeys(pom.getBkHotel().getLastName(), FileReadManager.getInsta_FRM().getInsta_CR().get_lName());
		inputKeys(pom.getBkHotel().getAddress(), FileReadManager.getInsta_FRM().getInsta_CR().get_Address());
		inputKeys(pom.getBkHotel().getCcnum(), FileReadManager.getInsta_FRM().getInsta_CR().get_ccNum());
		dropDown(pom.getBkHotel().getCcType(), "byText", "VISA");
		dropDown(pom.getBkHotel().getCcMonth(), "byValue", "4");
		dropDown(pom.getBkHotel().getCcYear(), "byValue", "2022");
		inputKeys(pom.getBkHotel().getCvv(), FileReadManager.getInsta_FRM().getInsta_CR().get_cvv());
		click(pom.getBkHotel().getBkNow());
//BookinConfirm
//		mouseClick(pom.getBkConfirm().getMyItinerary());
		click(pom.getBkConfirm().getMyItinerary());
		click(pom.getBkConfirm().getLogOut());
		
		
	}

}
