package com.parabank;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PBStepDefiniton {
	HelperClassPB helper = new HelperClassPB();
	RegisterActions regActions = new RegisterActions();

	@Given("User in the ParaBank Register Page")
	public void user_in_the_para_bank_register_page(String url) {
	    HelperClassPB.openPage(url);
	}
 
	@When("User clicks Register link")
	public void user_clicks_register_link(String registerlink) {
		regActions.clickRegister(registerlink);
	}
 
	@When("User enters firstname,lastname,address,city,state,zipcode,Phone,ssn")
	public void user_enters_firstname_lastname_address_city_state_zipcode_phone_ssn(string firstname,) {
		regActions.registerInfo(datas.firstname, datas.lastname,datas.address,datas.city,datas.state,datas.zipcode,datas.phone, datas.ssn);
	}
 
	@When("User enters Username,password and Confirm-Password")
	public void user_enters_username_password_and_confirm_password() {
		regActions.registerUser(datas.username, datas.password, datas.cpassword);
	}
 
	@When("User clicks Register button")
	public void user_clicks_register_button() {
		regActions.clickFinalRegisterbtn();
	}
 
	@Then("User able to see logged in page and logout an account")
	public void user_able_to_see_logged_in_page_and_logout_an_account() throws InterruptedException {
		
		//Existing User
//			Assert.assertTrue(regact.getErrorText().contains("This username already exists."));
		//New USer
			Assert.assertTrue(regActions.getVerifyText().contains("Your account was created successfully. You are now logged in."));
//			regact.clicklogout();
		
		
	   
	}
}