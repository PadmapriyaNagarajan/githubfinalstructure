package com.dataproperties;

import org.openqa.selenium.support.PageFactory;

public class DataPropertiesHomePageActions {
	DataPropertiesHomePageLocators datapropertieshomepagelocators;
	public DataPropertiesHomePageActions() {
		datapropertieshomepagelocators = new DataPropertiesHomePageLocators();
		PageFactory.initElements(DataPropertiesHelperClass.getDriver(), datapropertieshomepagelocators);
	}
	public String getVerifyText() {
		return datapropertieshomepagelocators.verifyHomeText.getText();
	}
	

	

	}


