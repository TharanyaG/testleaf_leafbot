package com.leafBot.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class FindleadsPoppage extends ProjectSpecificMethods {

	public FindleadsPoppage enterFromId() {
		Set<String> window = driver.getWindowHandles();
		List<String> newwind=new ArrayList<String>(window);
		driver.switchTo().window(newwind.get(1));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElementByXPath("((//input[@class=' x-form-text x-form-field'])[1])").sendKeys("10004");
		return this;
	}
	
	public FindleadsPoppage clickfindleadssearchbutton() throws InterruptedException {
		driver.findElementByXPath("(//button[text()='Find Leads'])").click();
		Thread.sleep(2000);
		return this;
	}
	
	public MergeLeadPage clickfirstsearchpop() throws InterruptedException {
		driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1])").click();
		Thread.sleep(2000);
		return new MergeLeadPage();
	}
}
