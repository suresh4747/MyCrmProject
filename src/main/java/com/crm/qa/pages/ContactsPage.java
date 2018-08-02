package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage  extends TestBase{

	
@FindBy(xpath=".//*[@align='left' and contains(text(),'Contacts')]")
WebElement ContactsLabel;
@FindBy (xpath="")
WebElement Contacts;

public ContactsPage() {
	PageFactory.initElements(driver, this);
}
public boolean VerifyContactsLabel() {
	return ContactsLabel.isDisplayed();
}
public void SelectContactsByName(String name) {
	driver.findElement(By.xpath("//a[text()='"+name+"']/../../"
	+ "preceding-sibling::tr/td[@class='datatitle']/input[@name='contact_id']")).click();
	
}


}
