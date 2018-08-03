package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest() {
		super();
	}


	
@BeforeMethod
	public void SetUp() throws InterruptedException {
	initialization();
	Thread.sleep(5000);
		loginpage =new LoginPage();
	
	}
@Test(priority=1,enabled=true)
public void LoginPageTitleTest() {
	String title=loginpage.ValidateLoginPageTitle();
	Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
}
@Test(priority=2)
public void crmlogoimgtest() {
	boolean flag = loginpage.ValidateCRMImage();
	Assert.assertTrue(flag);
}
@Test(priority=3)
public void login() {
	homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
}

@Test(priority=4,enabled=false)
public void login(String username, String password) {

	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.xpath(".//input[@type='submit']")).click();
	
}



@AfterMethod
public void close() {
	driver.quit();
}
}
