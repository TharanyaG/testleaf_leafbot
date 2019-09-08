package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="CRM/SFA") WebElement eleClick;
	public MyHomePage ClickCRMSFALink() {
	   click(eleClick);
		return this;
	}
	
	
	@FindBy(linkText="Leads") WebElement eleleadstab;
	
	
	public MyLeadsPage ClickLeadsTab() {

		click(eleleadstab);
		return new MyLeadsPage();
		
		
	}

	
	
}
