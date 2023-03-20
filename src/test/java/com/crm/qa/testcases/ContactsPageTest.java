package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	ContactsPage contactspage;

	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		Thread.sleep(5000);
		loginpage = new LoginPage();
		contactspage = new ContactsPage();
		testutil = new TestUtil();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.switchToFrame();
		contactspage = homepage.ClickOnContactsLink();

	}

	@Test(priority = 1)

	public void VerifyContactsLabelTest() {
		boolean flag = contactspage.VerifyContactsLabel();
		Assert.assertTrue(flag, "contacts page label is missing");
	}

	@Test(priority = 2)
	public void SelectContactsByNameTest() {
		// contactspage.SelectContactsByName("SURESH BABU");
	}

	@Test(priority = 3)
	public void SelectMultipleContactsByNameTest() {

		contactspage.SelectContactsByName("test testing");
        contactspage.SelectContactsByName("test2 testing");

	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}
//test1
