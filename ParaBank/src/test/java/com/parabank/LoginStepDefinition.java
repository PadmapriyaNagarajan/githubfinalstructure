package com.parabank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	HelperClassPB helper = new HelperClassPB();
	LoginAction loginaction = new LoginAction();
	
	
	@Given("User in the Para Bank HomePage")
	public void user_in_the_para_bank_home_page(String url) {
		System.out.println("Open Website");
		
	   
	}

	@When("User enters the username {string}")
	public void user_enters_the_username(String string) {
	}

	@When("USer enters the password {string}")
	public void u_ser_enters_the_password(String string) {
	   
	}

	@When("User clicks the Log in button")
	public void user_clicks_the_log_in_button() {
	    
	}

	@Then("User able to see Accounts Overview")
	public void user_able_to_see_accounts_overview() {
	    
	}

	@Then("User able to see Error Message")
	public void user_able_to_see_error_message() {
	   
	}


}
