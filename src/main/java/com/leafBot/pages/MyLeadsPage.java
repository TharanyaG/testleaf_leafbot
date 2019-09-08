package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {

	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Create Lead") WebElement elecreatelead;	
	public MyLeadsPage clickcreatetab() {

		click(elecreatelead);
		return this;
	}
	public FindLeadsPage clickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();
	}

	public MergeLeadPage clickmergelead() {
		driver.findElementByXPath("(//a[text()='Merge Leads'])").click();
		return new MergeLeadPage();
	}



}




