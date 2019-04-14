package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDataTest extends ExcelDataReadingConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch the Browser and URL
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		
		String username = ExcelDataRetrival(0,1,0);
		String password = ExcelDataRetrival(0,1,1);
		
		
		//Enter the user credentials
		WebElement Username = driver.findElement(By.name("username"));
		Username.clear();
		Username.sendKeys(username);
		WebElement Password = driver.findElement(By.name("password"));
		Password.clear();
		Password.sendKeys(password);
     	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		    
			e.printStackTrace();
		
		}
		//Click on Login Button
     	driver.findElement(By.xpath("//input[@type='submit']")).click();


	}

}
