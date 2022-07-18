package com.stepdefenition;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.basclass.BaseClass;
import com.helperfile.FileReadManager;
import com.pojoclass.PageObjManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefnAdac extends BaseClass {

	//public static WebDriver driver = getBrowser("chrome");

	public static PageObjManager pom= new PageObjManager(driver);
	
	@Given("User launch the Browser")
	public void user_launch_the_browser() throws IOException {			
		getUrl(FileReadManager.getInsta_FRM().getInsta_CR().get_Url());
	}	
	@When("User enter the Userame in User Name field")
	public void user_enter_the_userame_in_user_name_field() throws IOException {
		inputKeys(pom.getLp().getUsername(), FileReadManager.getInsta_FRM().getInsta_CR().get_Uname());
	}
	@And("User enter Password in Password field")
	public void user_enter_password_in_password_field() throws IOException {
		inputKeys(pom.getLp().getPassword(), FileReadManager.getInsta_FRM().getInsta_CR().get_Pass());
	}
	@Then("User is enter the Login button")
	public void user_is_enter_the_login_button() {
		click(pom.getLp().getLoginBtn());
	}
//=========================
	
	@Given("User chooses the Location")
	public void user_chooses_the_location() {
		dropDown(pom.getShOne().getLocation(), "bytext", "London");	
	}
	@When("User choose the Hotel")
	public void user_choose_the_hotel() {
		dropDown(pom.getShOne().getHotels(), "byindex", "2"); 
	}
	@And("User choose Room Type")
	public void user_choose_room_type() {
		dropDown(pom.getShOne().getRoomType(), "bytext", "Deluxe");
	}
	@And("User choose No of Rooms")
	public void user_choose_no_of_rooms() {
		dropDown(pom.getShOne().getRoomNos(), "byvalue", "1");
	}
	@And("User enter check in date")
	public void user_enter_check_in_date() {
		inputKeys(pom.getShOne().getCheckIn(), "10/08/2022");
	}
	@And("User enter check out date")
	public void user_enter_check_out_date() {
		inputKeys(pom.getShOne().getCheckOut(), "13/08/2022");
	}
	@And("User mentions no of Adults in room")
	public void user_mentions_no_of_adults_in_room() {
		dropDown(pom.getShOne().getAdultNroom(), "byvalue", "2");
	}
	@And("User mentions no fo child in room")
	public void user_mentions_no_fo_child_in_room() {
		dropDown(pom.getShOne().getChildNroom(), "byindex", "0");
	}
	@Then("User is enter the Submit button")
	public void user_is_enter_the_submit_button() {
		click(pom.getShOne().getSubmit());
	}
//===================
	@Given("User selects the hotel")
	public void user_selects_the_hotel() {
		radioBtn(pom.getShTwo().getSelectRad());
	}

	@Then("User continue the booking")
	public void user_continue_the_booking() {
		click(pom.getShTwo().getContiNue());
	}
//=========================
	
	@Given("User enter name in First Name field")
	public void user_enter_name_in_first_name_field() throws AWTException, IOException {
		keyPress("pagedown");
		inputKeys(pom.getBkHotel().getFirstName(), FileReadManager.getInsta_FRM().getInsta_CR().get_fName());		
	}
	@When("User enter surname in Last Name field")
	public void user_enter_surname_in_last_name_field() throws IOException {
		inputKeys(pom.getBkHotel().getLastName(), FileReadManager.getInsta_FRM().getInsta_CR().get_lName());
	}
	@And("User enter address in address field")
	public void user_enter_address_in_address_field() throws IOException {
		inputKeys(pom.getBkHotel().getAddress(), FileReadManager.getInsta_FRM().getInsta_CR().get_Address());
	}
	@And("User enter CreditCard number in CC number field")
	public void user_enter_credit_card_number_in_cc_number_field() throws IOException {
		inputKeys(pom.getBkHotel().getCcnum(), FileReadManager.getInsta_FRM().getInsta_CR().get_ccNum());
	}
	@And("User choose type of Credit Card")
	public void user_choose_type_of_credit_card() {
		dropDown(pom.getBkHotel().getCcType(), "byText", "VISA");
	}
	@And("User choose expiry month of Credit Card")
	public void user_choose_expiry_month_of_credit_card() {
		dropDown(pom.getBkHotel().getCcMonth(), "byValue", "4");
	}
	@And("User Choose expiry year of Credit Card")
	public void user_choose_expiry_year_of_credit_card() {
		dropDown(pom.getBkHotel().getCcYear(), "byValue", "2022");
	}
	@And("User enter CVV number of Credit Card")
	public void user_enter_cvv_number_of_credit_card() throws IOException {
		inputKeys(pom.getBkHotel().getCvv(), FileReadManager.getInsta_FRM().getInsta_CR().get_cvv());
	}
	@Then("User enter Book Now button")
	public void user_enter_book_now_button() {
		click(pom.getBkHotel().getBkNow()); 
	}
	
//======================
	@Given("User check the detail in Booked Itinerary")
	public void user_check_the_detail_in_booked_itinerary() {
		click(pom.getBkConfirm().getMyItinerary());
	}

	@Then("User enter logout")
	public void user_enter_logout() {
		click(pom.getBkConfirm().getLogOut());
	}

		
		

}
