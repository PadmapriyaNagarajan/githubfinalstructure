package com.dataproperties;

import org.openqa.selenium.support.PageFactory;

public class DataPropertiesLoginActionClass {
	DataPropertiesLoginLocators objloginlocators;
	String strUsername,strUserPassword;
	
	 DataPropertiesLoginActionClass(){
		this.objloginlocators = new DataPropertiesLoginLocators();
		
		PageFactory.initElements(DataPropertiesHelperClass.getDriver(), objloginlocators);
	}
	
	public void setuserName(String strUsername) {
		objloginlocators.username.sendKeys(strUsername);
	}
	
	public void setUserPassword(String strUserPassword) {
		objloginlocators.password.sendKeys(strUserPassword);
	}
	
	public void clickLoginButton() {
		objloginlocators.login.click();
	}
	public void logindetails(String strUsername, String strUserPassword) {
		this.setuserName(strUsername);
		this.setUserPassword(strUserPassword);
	}
	
	
}
	