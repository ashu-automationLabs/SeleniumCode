package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

    WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1,groups="Sanity")
	public void validatePageTitle() 
	{
		String pageTitle=driver.getTitle();
		
	}
	
	@Test(priority=2,groups="Regression")
	public void validateLogo() 
	{
		boolean logocheck=driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();		
	}
	
	@Test(priority=3,groups="Sanity")
	public void validateGmaillink() 
	{
		boolean GmailLink=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		
	}
	
	@AfterMethod
	public void teardown() 
	{
		driver.quit();
	}
	
	
	
}
