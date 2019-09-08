package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public static String fname;

	
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="(//span[@class='tabletext'])[4]") WebElement elefname;
	public ViewLeadPage verifycreatelead() {
		String firstname = elefname.getText();
		//String firstname = driver.findElementByXPath("(//span[@class='tabletext'])[4]").getText();
		System.out.println(firstname);
		if(firstname.contains("Tharanya")) {
			System.out.println("Verified firstname");
		}
		else {
			System.out.println("Not verified");
		}
		return this;
	}

	public EditLeadPage clickedit() {
		
		driver.findElementByLinkText("Edit").click();
		return new EditLeadPage();
		
	}
	
	public DuplicateLeadPage clickDuplicate() {
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		return new DuplicateLeadPage();
	}
}
