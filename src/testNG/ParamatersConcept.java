package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamatersConcept {

@Parameters({"email","password"})	
@Test
public void loginintoFB(String Uname,String Pass)
{
	System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Launch the Browser and URL
	driver.get("https://www.facebook.com");
	//To maximize the browser window  
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys(Uname);
	driver.findElement(By.id("pass")).sendKeys(Pass);
	driver.findElement(By.xpath("//input[@value='Log In']"));
	
	

}
	
	
	
}
