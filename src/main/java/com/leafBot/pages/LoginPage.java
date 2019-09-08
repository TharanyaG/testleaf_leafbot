package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
public LoginPage() {
	PageFactory.initElements(driver, this);
}
 @FindBy(id="username") WebElement eleUserName;
	public LoginPage enterUserName(String userName) {
		clearAndType(eleUserName, userName);
		return this;
	}
	@FindBy(id="password") WebElement elePassword;
	public LoginPage enterPassword(String password) {
		clearAndType(elePassword, password);
		return this;
	}
	
	@FindBy(className="decorativeSubmit") WebElement eleClick;
	public MyHomePage clickLogin() {
		click(eleClick);
		return new MyHomePage();
	}
}
