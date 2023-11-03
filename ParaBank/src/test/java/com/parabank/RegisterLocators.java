package com.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocators {
	@FindBy(xpath = "//a[text()='Register']")
	WebElement registerbutton;
	
	@FindBy(name="customer.firstName")
	WebElement firstName;
	
	@FindBy(name="customer.lastName")
	WebElement lastName;
	
	@FindBy(name="customer.address.street")
	WebElement address;
	
	@FindBy(name="customer.address.city")
	WebElement city;
	
	@FindBy(name="customer.address.state")
	WebElement state;
	
	@FindBy(name="customer.address.zipCode")
	WebElement zipcode;
	
	@FindBy(name="customer.phoneNumber")
	WebElement  phoneNumber;
	
	@FindBy(name="customer.ssn")
	WebElement ssn;
	
	@FindBy(name="customer.username")
	WebElement username;
	
	@FindBy(name="customer.password")
	WebElement password;
	
	@FindBy(name="repeatedPassword")
	WebElement repeatedPassword;
	
	@FindBy(xpath="(//input[@class='button'])[2]")
	WebElement regClick;

	
}


