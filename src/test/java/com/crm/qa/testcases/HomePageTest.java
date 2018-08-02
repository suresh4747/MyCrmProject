package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	HomePage homepage;
TasksPage taskpage;
TestUtil testUtil;
ContactsPage contactsPage;


	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		Thread.sleep(5000);
		LoginPage loginpage = new LoginPage();
		contactsPage=new ContactsPage();
		testUtil =new TestUtil();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=2)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homepage.VerifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO", "homepage title not matched");

	}
	@Test(priority=1)
	public void ClickOnContactsLinkTest() {
	try {
		testUtil.switchToFrame();
		//driver.switchTo().frame(1);
	} catch (Exception e) {
		System.out.println("switch to frame ");
		e.printStackTrace();
	}
		homepage.ClickOnContactsLink();
		
	}
	
	
@Test(priority=3)
public void VerifyCorrectUserNameTest() {
	testUtil.switchToFrame();
	Assert.assertTrue(homepage.VerifyCorrectUserName());
	
}
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
