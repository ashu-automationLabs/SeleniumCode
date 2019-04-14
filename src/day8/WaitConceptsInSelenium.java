package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConceptsInSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch the Browser and URL
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@type='email']"));
		username.clear();
		username.sendKeys("ashutosh00713");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
				
	    WebDriverWait wait= new WebDriverWait(driver, 20);
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		password.sendKeys("sanjushalini69");
	   
       
		

	}


}
