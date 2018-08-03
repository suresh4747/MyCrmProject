package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath=".//td[@class='headertable']/table/tbody/tr/td[1]")
WebElement userNameLabel;	
	
	@FindBy(xpath=".//a[contains(text(),'Contacts')]")
	WebElement contactsLink ;
	
	@FindBy(xpath=".//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath=".//a[contains(text(),'Tasks')]")
	WebElement tasksLink ;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String VerifyHomePageTitle() {
		return driver.getTitle();
	}
	public boolean VerifyCorrectUserName() {
	return	 userNameLabel.isDisplayed();
	}
	
	public ContactsPage ClickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	public TasksPage ClickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}
	public DealsPage ClickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}

	
	
	
}
