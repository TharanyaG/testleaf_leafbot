package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	
	public EditLeadPage clearcompname() {
		driver.findElementById("updateLeadForm_companyName").clear();
return this;
	}
 public EditLeadPage entercompname() {
		driver.findElementById("updateLeadForm_companyName").sendKeys("HCL");
return this;
 }

public ViewLeadPage clickupdate() {
	driver.findElementByXPath("(//input[@class='smallSubmit'][1])").click();
return new ViewLeadPage();
	
}

}


