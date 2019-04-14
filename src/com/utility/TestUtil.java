package com.utility;

import java.util.ArrayList;

public class TestUtil {
	public static Xls_Reader reader;
	
	
	public static ArrayList<Object[]> getDataFromExcel(String Sheetname) 
	{
		ArrayList<Object[]> mydata= new ArrayList<Object[]>();
		
		reader= new Xls_Reader(System.getProperty("user.dir")+"\\src\\testdata\\SignupTestData.xlsx");
		
		for(int rowNum =2;rowNum<=reader.getRowCount(Sheetname);rowNum++) 
		{
			String f_name =reader.getCellData(Sheetname,"FirstName", rowNum);
			String l_name =reader.getCellData(Sheetname, "LastName", rowNum);
			String mobile =reader.getCellData(Sheetname, "MobileNumber", rowNum);
			String pass   =reader.getCellData(Sheetname, "Password", rowNum);
			
			Object[] obj= {f_name,l_name,mobile,pass};		
			
			mydata.add(obj);
		}
		
		return mydata;
	}
	
}
