package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {

	WebDriver driver;
	SoftAssert softAssert= new SoftAssert();
@BeforeMethod
public void setup() 
{
	//1.Configure your browser and Launch
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Jars\\chromedriver.exe");
    driver= new ChromeDriver();
	//2. Launch the website    
	driver.get("https://www.freecrm.com/");
	//3. Maximize the browser
	driver.manage().window().maximize();

}

@Test
public void login() throws InterruptedException 
{
	driver.findElement(By.name("username")).sendKeys("sharma11");
	driver.findElement(By.name("password")).sendKeys("test123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
    String homePageTitle=driver.getTitle();
    Assert.assertEquals(homePageTitle, "CRMPRO");/// This is important why? it will verify your succesfull login
    
    driver.switchTo().frame("mainpanel");
    driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
    
    String ContactTitle=driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[1]/td/table/tbody/tr/td[1]")).getText();
    softAssert.assertEquals(ContactTitle, "Contact", "Title not matching");// This is not so Important 
    
    driver.findElement(By.xpath("//*[@id=\"extendedSearchLayer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/input")).sendKeys("Ashutosh");
    driver.findElement(By.xpath("//*[@id=\"extendedSearchLayer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[2]/input")).sendKeys("Wipro");
    driver.findElement(By.xpath("//*[@id=\"extendedSearchLayer\"]/table/tbody/tr[2]/td[2]/table/tbody/tr[7]/td[2]/input[2]")).click();

    softAssert.assertAll();
}

@AfterMethod
public void teardown() 
{
	driver.quit();



}

	
}
