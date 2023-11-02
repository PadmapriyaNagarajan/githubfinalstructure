package com.dataproperties;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DataPropertiesStepDefinition {
	DataPropertiesHelperClass helperclass;
	DataPropertiesLoginActionClass loginactions;
	UtilityProperties  utilproperties;
	DataPropertiesHomePageActions homeactions;
	@Given("User providing url and launching webpage")
	public void user_providing_url_and_launching_webpage() {
		DataPropertiesHelperClass.openPage(utilproperties.url);
	}
	@When("User providing valid username and valid password")
	public void user_providing_valid_username_and_valid_password() {
		loginactions.logindetails(utilproperties.username, utilproperties.password); 
	}
	@When("User clicking the login button and successfully logging")
	public void user_clicking_the_login_button_and_successfully_logging() {
		loginactions.clickLoginButton();
	  
	}
	@Then("User get into home page")
	public void user_get_into_home_page() {
		Assert.assertTrue(homeactions.getVerifyText().contains("Dashboard"));
		System.out.println("Dashboard home page is open");
	}
}
