package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchBrowser {

	WebDriver driver= null;
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
	
	@Test
	public void launchingURL() {
		
	    //Launch the Browser and URL
		driver.get("https://www.facebook.com");
		//To maximize the browser window  
		driver.manage().window().maximize();
		//To close the Browser
		
	}
	
	@AfterMethod
	public void teardown() 
	{
		driver.close();
		
	}
}
