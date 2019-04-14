package day14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
	 System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.id("email")).sendKeys("ashutosh.kumar@techizen.com");
	 driver.findElement(By.id("pass")).sendKeys("Qaz@wsx!");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	@Test(priority=1)
	public void pagetitle() 
	{// user requirement-: Page title should be FB after successful login
     	String pagetitle=driver.getTitle();
     	Assert.assertEquals(driver.getTitle(), "Facebook");
   
	}
	
    @Test(priority=2,dependsOnMethods="pagetitle")
	public void validateloggedinuser() 
	{
		
		String Uname=driver.findElement(By.xpath("//div[contains(text(),'Ashutosh Kumar')]")).getText();
		Assert.assertEquals(Uname, "Ashutosh Kumar");
	}
		

	@Test(priority=3,dependsOnMethods="pagetitle")
	public void enterTextontimeline() 
	{	
		WebElement timeline=driver.findElement(By.xpath("//div[contains(text(),'Write som')]"));
		timeline.click();
		timeline.sendKeys("Hi");
	}
	
	@AfterMethod
	public void teardown() 
	{
		driver.quit();
		
	}
}
