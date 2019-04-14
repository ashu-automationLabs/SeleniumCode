package day12;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import day10.TakeScreenshotConcept;

public class FailScreenShotConcept {
	
	public WebDriver driver =null;

@BeforeMethod	
public void setupBrowser() 
{
	 System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
	 driver = new ChromeDriver();
}	
	
 @Test
 @Parameters({"url","uname","pass"})
 public void loginintoFacebook(String url,String uname, String pass) 
 {
	
	 driver.manage().window().maximize();
	 driver.get(url);
	 WebElement username= driver.findElement(By.xpath("//input[@type='email']"));
	 username.clear();
	 username.sendKeys(uname);
	 WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
	 password.clear();
	 password.sendKeys(pass);
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 
	 //Verify Account
	 
	 WebElement userinfo=driver.findElement(By.xpath("//*[@id=\"navItem_100000479779903\"]/a/div"));
     String userfullname =userinfo.getText();
     Assert.assertEquals(userfullname, "Ashutosh Kumar");
 }

 @AfterMethod
 public void breakdown(ITestResult result) 
 {
	 if(ITestResult.FAILURE==result.getStatus()) 
	 {
		 
		 TakeScreenshotConcept.takescreenshot(driver, result.getName());
		 
	 }
	driver.quit(); 
	 
 }
	
	
	
}
