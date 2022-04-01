package org.StepDefine;

import org.baseclass.BaseMethods;
import org.jsoup.safety.Cleaner;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefine extends BaseMethods {

@Given("user is on Adactin Hotel Booking page")
public void user_is_on_facebook_page() {
	browserlaunch("https://adactinhotelapp.com/");
}

//@When("user should enter username and password")
//public void user_should_enter_username_and_password() {
//	
//	sendvalues(findElementByid("email"), "Keny");
//	sendvalues(findElementByid("pass"), "keny@123");
//}
@When("user should enter {string} and {string}")
public void user_should_enter_and(String name, String password) {
	WebElement userName = findElementByid("username");
	sendvalues(userName, name);
	WebElement passWord=findElementByname("password");
	sendvalues(passWord, password);
	
}

@And("user should click the login button")
public void user_should_click_the_login_button() {
	clickButton(findElementByname("login"));	
}
@Then("user should verify the success msg")
public void user_should_verify_the_success_msg() {
	System.out.println("Successfully login into Adactin Hotel");
}
@Then ("user should select Location,Hoteltype,Roomtype,Number of Rooms,Check in date,Check out date,Adult per Room,Children per Room")
public void user_should_select_Location_Hoteltype_Roomtype_Number_of_Rooms_Check_in_date_Check_out_date_Adult_per_Room_Children_per_Room() throws InterruptedException {
	selectbyValue( findElementByid("location"),"Paris");
	selectbytext(findElementByid("hotels"), "Hotel Sunshine");
	selectbyValue( findElementByid("room_type"), "Super Deluxe");
	threadtime(2000);
	selectbyValue(findElementByid("room_nos"), "2");
	clearbox(findElementByid("datepick_in"));
	sendvalues(findElementByid("datepick_in"), "25/01/2022");
	clearbox(findElementByid("datepick_out"));
	sendvalues( findElementByid("datepick_out"), "26/01/2022");
	selectbyValue(findElementByid("adult_room"), "2");
	selectbyValue(findElementByid("child_room"), "2");
}

@Then("user should click on search button")
public void user_should_click_on_search_button() {
	clickButton(findElementByid("Submit"));
	System.out.println("successfully booked room");
}

@Then("click logout")
public void click_logout() {
	findElementByXpath("//a[text()='Logout']").click();
}

@Then("new user can click login")
public void new_user_can_click_login() {
	findElementByXpath("//a[text()='Click here to login again']").click();
	}

@Given("new user should enter {string} and {string}")
public void new_user_should_enter_and(String name, String password) {
	sendvalues(findElementByid("username"), name);
	sendvalues(findElementByname("password"), password);
}

@When("new user should click the login button")
public void new_user_should_click_the_login_button() {
	clickButton(findElementByname("login"));	
}
@And("new user should verify the success msg")
public void new_user_should_verify_the_success_msg() {
	System.out.println("Successfully login into Adactin Hotel");
}
@Then("new user should select Location,Hoteltype,Roomtype,Number of Rooms,Check in date,Check out date,Adult per Room,Children per Room")
public void new_user_should_select_Location_Hoteltype_Roomtype_Number_of_Rooms_Check_in_date_Check_out_date_Adult_per_Room_Children_per_Room() throws InterruptedException {
	selectbyValue( findElementByid("location"),"Paris");
	selectbytext(findElementByid("hotels"), "Hotel Sunshine");
	selectbyValue( findElementByid("room_type"), "Super Deluxe");
	threadtime(2000);
	selectbyValue(findElementByid("room_nos"), "2");
	clearbox(findElementByid("datepick_in"));
	sendvalues(findElementByid("datepick_in"), "26/01/2022");
	clearbox(findElementByid("datepick_out"));
	sendvalues( findElementByid("datepick_out"), "27/01/2022");
	selectbyValue(findElementByid("adult_room"), "2");
	selectbyValue(findElementByid("child_room"), "2");
}


@Then("new user should click on search button")
public void new_user_should_click_on_search_button() {
	clickButton(findElementByid("Submit"));
	System.out.println("successfully booked room");
}

@Then("new login click logout")
public void new_login_click_logout() {
	findElementByXpath("//a[text()='Logout']").click();
}
}
