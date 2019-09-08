package com.leafBot.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods {

	public FindleadsPoppage clickFromleadicon() {
		driver.findElementByXPath("((//img[@src='/images/fieldlookup.gif']//parent::a)[1])").click();
		return new FindleadsPoppage();
	}

	public MergeLeadPage enterToleadid() {
		Set<String> window = driver.getWindowHandles();
		List<String> newwind=new ArrayList<String>(window);
		driver.switchTo().window(newwind.get(0));
		driver.findElementByXPath("(//input[@name='ComboBox_partyIdTo'])").sendKeys("10005");
		return this;
	}
	
	public MergeLeadPage clickMerge() {
		
		driver.findElementByXPath("(//a[text()='Merge'])").click();
		return this;
		
	}
	
	public MergeLeadPage acceptAlerts() {
		Alert alert = driver.switchTo().alert();
		alert.accept();		
		return this;
	}
	
}
