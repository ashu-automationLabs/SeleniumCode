package day15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationConcept {
    WebDriver driver;
	
	@Test(invocationCount=2)
	public void login() {
		
		 System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement email= driver.findElement(By.id("email"));
		 boolean emailflag =email.isDisplayed();
		 Assert.assertEquals(emailflag, false,"The field is available on the WebPage");
		 driver.findElement(By.id("email")).clear();
		 
		 driver.findElement(By.id("email")).sendKeys("ashutosh.kumar@techizen.com");
		 driver.findElement(By.id("pass")).clear();
		 driver.findElement(By.id("pass")).sendKeys("Qaz@wsx!");
		 //driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		 
		
	}
	
	
	
}
