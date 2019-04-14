package day13;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeSuite
	public void setup() 
	{
		System.out.println("This is my BeforSuite");
		
	}
	
	@BeforeTest
	public void beforeTest() 
	{
	   System.out.println("This is my Before Test");
	   	   
	}
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("This is my beforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("This is my before Method");
		
	}
	@Test
	public void AddtoContact() 
	{
		System.out.println("This my test to add contact");
		
			
	}
	
	@Test
	public void contactSearch() 
	{
		System.out.println("This my ContactSearch");
		
	}
	
	@Test
	public void login() 
	{
		
		System.out.println("This is my login test");
    }
	
	@Test
	public void checktheURL() 
	{
		
		System.out.println("This is test to check URL");
    }
	
	
	@Test
	public void test4() 
	{
		System.out.println("This is test4");
		
	}
	
	@Test
	public void test5() 
	{
		System.out.println("This is test5");
		
	}
	
	@Test
	public void test6() 
	{
		System.out.println("This is test6");
		
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("This is my AfterMethod");
		
	}
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("This is my AfterClass");
	}
	
	@AfterTest
	public void afterTest() 
	{
	   System.out.println("This is my After Test");
	   	   
	}

	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("This is my AfterSuite");
		
	}
	
	
	
	

	
}
