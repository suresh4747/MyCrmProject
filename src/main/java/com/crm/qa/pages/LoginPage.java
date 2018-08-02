package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// pagefactory OR:

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = ".//input[@type='submit']")
	WebElement loginbtn;

	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement signup;

	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;
//initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
		
	}
	
	public boolean ValidateCRMImage() {
		return crmlogo.isDisplayed();
	}

	
	public HomePage login(String un,String pwd) {
	username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
	return new	HomePage(); 
	}
}
