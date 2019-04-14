package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGConcept {
  public WebDriver driver=null;
	
	@BeforeTest
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	@Test   //Testcase for login into the application with valid credentials
	public void login() {
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//Enter the username and Password 
		
		WebElement usernamefield= driver.findElement(By.name("email"));
		usernamefield.clear();
		usernamefield.sendKeys("ashu00713");
		WebElement passwordfield = driver.findElement(By.name("pass"));
		passwordfield.clear();
		passwordfield.sendKeys("password");
		
		
	}
	
	@AfterTest
	public void teardown() 
	{
		driver.quit();
		
	}
	
	
	
}
