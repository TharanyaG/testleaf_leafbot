package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="submitButton") WebElement elesubmitbutton;
	@FindBy(id="createLeadForm_lastName") WebElement elelastname;
	@FindBy(id="createLeadForm_firstName") WebElement elefirstname;
	@FindBy(id="createLeadForm_companyName") WebElement elecompname;
	
	
	
	public CreateLeadPage entercompname() {
	clearAndType(elecompname, "Cognizant");
		return this;

	}
	public CreateLeadPage Enterfname() {
		//WebElement firstnames = driver.findElementById("createLeadForm_firstName");
		clearAndType(elefirstname, "Tharanya");
		return this;
	}

	public CreateLeadPage Enterlname() {
		
		clearAndType(elelastname, "G");
		return this;
		
	}
	public ViewLeadPage clicksubmit() {
		
		click(elesubmitbutton);
		return new ViewLeadPage();
	}

	
	

}
