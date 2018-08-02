package com.crm.qa.util;

import java.util.ArrayList;

import org.apache.poi.xssf.eventusermodel.XSSFReader;

public class TestUtil1 {
	static XSSFReader reader;
	public static void getDataFromExcel() {
		
		ArrayList <Object[]> myData=new ArrayList<Object[]>();
		try {
				reader=new XSSFReader("C:\\WorkspaceFinal\\MyCrmProject\\test data\\FreeCrmLoginData.xlsx");
		}
	
	}

}
