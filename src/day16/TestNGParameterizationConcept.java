package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utility.Xls_Reader;

public class TestNGParameterizationConcept {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
	}
	
	@Test@Parameters({"uname","pass"})
	public void login(String uname,String pass) 
	{
		 //boolean emailflag =email.isDisplayed();
		 //Assert.assertEquals(emailflag, false,"The field is available on the WebPage");
		 driver.findElement(By.id("email")).clear();
		 driver.findElement(By.id("email")).sendKeys(uname);
		 driver.findElement(By.id("pass")).clear();
		 driver.findElement(By.id("pass")).sendKeys(pass);
		
	}
		
	@AfterMethod
	public void teardown() 
	{
		driver.close();
		
	}
}
