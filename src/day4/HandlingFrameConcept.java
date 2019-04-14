package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameConcept {

	public static void main(String[] args) throws Exception {
		
		
			System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//Launch the Browser and URL
			driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.16837567.748013806.1537679256-826436237.1537679256");
			driver.manage().window().maximize();
			//Enter the user credentials
			WebElement Username = driver.findElement(By.name("username"));
			Username.clear();
			Username.sendKeys("ashu00713");
			WebElement Password = driver.findElement(By.name("password"));
			Password.clear();
			Password.sendKeys("password");
	     	Thread.sleep(5000);
			//Click on Login Button
	     	driver.findElement(By.xpath("//input[@type='submit']")).click();
	     	driver.switchTo().frame(1);
	     	Thread.sleep(5000);
	     	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	     	driver.close();
	     
	}

}
