


	
	
	
	
	package com.crm.qa.testcases;

	import java.util.ArrayList;

import org.openqa.selenium.By;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.crm.qa.base.TestBase;
	import com.crm.qa.pages.HomePage;
	import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil1;

	public class LoginPageTestDataProvider extends TestBase{
		LoginPage loginpage;
		HomePage homepage;
		public LoginPageTestDataProvider() {
			super();
		}

	@DataProvider
	public void getTestData(){
		ArrayList<Object[]> testData=TestUtil1.getDataFromExcel();
		
	}
		
	@BeforeMethod
		public void SetUp() throws InterruptedException {
		initialization();
		Thread.sleep(5000);
			loginpage =new LoginPage();
		
		}
	

	@Test(priority=1)
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

