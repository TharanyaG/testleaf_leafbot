package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{
	public static String firstname1;
	public FindLeadsPage clickphonetab() {
	driver.findElementByXPath("(//span[text()='Phone'])").click();
	return this;
	}
	public FindLeadsPage clicknametab() {
	driver.findElementByXPath("(//span[text()='Name and ID'])").click();
	return this;
	}
	public FindLeadsPage enterfirstname() {
		driver.findElementByXPath("((//div[@class='x-form-element']/input)[14])").sendKeys("Kalaiselvi");
		return this;
	}
	
	public FindLeadsPage clicksearchleads() throws InterruptedException { 
	
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(3000);
	return this;
	}
	
	public ViewLeadPage clickfirstresultinglead() {
	driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1])").click();
	return new ViewLeadPage();
	}
	
	public FindLeadsPage clickemail() {
		driver.findElementByXPath("(//span[text()='Email'])").click();
		return this;
	}
	public FindLeadsPage enteremail() {
		driver.findElementByXPath("((//div[@class='x-form-element']/input)[17])").sendKeys("kalaisjdcu@gmail.com");
		
		return this;
	}
	
	public FindLeadsPage getnameoflead() {
		String firstname1 = driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1])").getText();
	return new FindLeadsPage();
	}

}
