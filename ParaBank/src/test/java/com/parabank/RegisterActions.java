package com.parabank;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;

public class RegisterActions {
	RegisterLocators registerLocators;
 
	public RegisterActions() {
		registerLocators = new RegisterLocators();
		PageFactory.initElements(HelperClassPB.getDriver(), registerLocators);
 
	}
	
	public void clickRegister(String registerlink) {
		registerLocators.registerbutton.click();
	}
	public void setFirstname(String strFirstName) {
		registerLocators.firstName.sendKeys(strFirstName);
	}
	
	public void setLastName(String strLastName) {
		registerLocators.lastName.sendKeys(strLastName);
	}
	
	public void setaddress(String strAddress) {
		registerLocators.address.sendKeys(strAddress);
	}
	
	public void setCity(String strCity) {
		registerLocators.city.sendKeys(strCity);
	}
	
	public void setState(String strState) {
		registerLocators.state.sendKeys(strState);
	}
	
	public void setzipcode(String strZipcode) {
		registerLocators.zipcode.sendKeys(strZipcode);
	}
	
	public void setPhoneNumber(String strPhoneNumber) {
		registerLocators.phoneNumber.sendKeys(strPhoneNumber);
	}
	
	public void setssn(String ssn) {
		registerLocators.ssn.sendKeys(ssn);
	}
	
	public void setUsername(String strUsername) {
		registerLocators.username.sendKeys(strUsername);
	}
	
	public void setpassword(String strPassword) {
		registerLocators.password.sendKeys(strPassword);
	}
	
	public void setConfirmPwd(String confirmpassword) {
		registerLocators.repeatedPassword.sendKeys(confirmpassword);
	}
	
	public void clickFinalRegisterbtn() {
		registerLocators.regClick.click();
	}
	
	public void registerDetails(String strFirstName,String strLastName,String strAddress,String strCity,String strState,String strZipcode,String strPhoneNumber,String ssn,String strUsername,String strPassword,String confirmpassword) {
		setUsername(strUsername);
		setLastName(strLastName);
		setaddress(strAddress);
		setCity(strCity);
		setState(strState);
		setzipcode(strZipcode);
		setPhoneNumber(strPhoneNumber);
		setssn(ssn);
		setUsername(strUsername);
		setpassword(strPassword);
		setConfirmPwd(confirmpassword);
	}
}