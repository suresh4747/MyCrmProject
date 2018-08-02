package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 50;
	public static long IMPLICIT_WAIT = 10;

	public void switchToFrame() {
		driver.switchTo().frame(1);

	}
	/*
	 * static Xls_Reader reader; public static void getTestData() {
	 * ArrayList<Object[]> mydata= new ArrayList<Object[]>();
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

}