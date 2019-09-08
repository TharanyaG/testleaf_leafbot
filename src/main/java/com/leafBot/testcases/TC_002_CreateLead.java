package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.CreateLeadPage;
import com.leafBot.pages.LoginPage;
import com.leafBot.pages.MyHomePage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC_002_CreateLead extends ProjectSpecificMethods {
@BeforeTest
	
	public void SetData() {
	excelFileName="TC001";
		testcaseName="Login";
		testcaseDec="TC_001_CreateLead";
		author="Tharanya";
		category="smoke";
			}
	@Test(dataProvider="fetchData")
	public void runCreateLead(String userName, String password) {
		new LoginPage().enterUserName(userName).enterPassword(password).clickLogin();
		new MyHomePage().ClickCRMSFALink().ClickLeadsTab()
		.clickcreatetab();
		new CreateLeadPage().entercompname().Enterfname().Enterlname().clicksubmit().verifycreatelead();
		}

}
