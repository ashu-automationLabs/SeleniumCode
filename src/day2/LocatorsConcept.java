package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch URL
		driver.get("https://www.facebook.com");
        
		//Enter the username and Password 
		
		WebElement usernamefield= driver.findElement(By.name("email"));
		usernamefield.clear();
		usernamefield.sendKeys("ashu00713");
		
		WebElement passwordfield = driver.findElement(By.name("pass"));
		passwordfield.clear();
		passwordfield.sendKeys("Qaz@wsx!");
		
		//Click on Button
		//driver.findElement(By.id("loginbutton")).click();
		
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		
		driver.close();
		
		
		
		
		
	}

}
