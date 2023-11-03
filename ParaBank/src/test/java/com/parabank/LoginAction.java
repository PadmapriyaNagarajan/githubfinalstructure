package com.parabank;

import org.openqa.selenium.support.PageFactory;

public class LoginAction {
	LoginLocators objLoginLoc;
	
	public LoginAction() {
		objLoginLoc = new LoginLocators();
		PageFactory.initElements(HelperClassPB.getDriver(), objLoginLoc);
	}
	
	public void setUsername(String logUsername) {
		objLoginLoc.loginUsername.sendKeys(logUsername);
	}
	public void setPwd(String logpwd) {
		objLoginLoc.loginPwd.sendKeys(logpwd);
	}
	public void clickLoginBtn() {
		objLoginLoc.loginbtn.click();
	}
	public void loginDetails(String logUsername, String logpwd) {
		setUsername(logUsername);
		setPwd(logpwd);
	}

}
