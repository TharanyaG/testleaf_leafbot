package com.leafBot.pages;


import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage clickcreatelead() {
		
		String title = driver.findElementByXPath("(//div[@class='x-panel-header sectionHeaderTitle'])").getText();
		if(title.contains("Duplicate Lead")) {
			System.out.println("Title verified");
		}
		else {
			System.out.println("Title not matched");
			}
		driver.findElementByXPath("(//input[@value='Create Lead'])").click();
		String firstname2 = driver.findElementByXPath("(//span[@id='viewLead_firstName_sp'])").getText();

//		if(firstname1.equals(firstname2)) {
//			System.out.println(firstname1+" and "+firstname2);
//			System.out.println("Name Matches");
//			}
return new ViewLeadPage();

	}
	
}
