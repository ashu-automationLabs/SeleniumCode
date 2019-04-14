package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOperations {
    
	@Test
	public  void basic() {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch the Browser and URL
		driver.get("http://toolsqa.com/automation-practice-form/");
		//To maximize the browser window  
		driver.manage().window().maximize();
		//To get Page Title
		System.out.println(driver.getTitle());
		//To get Page Source
		//System.out.println(driver.getPageSource());
		//To check wheter it is selected or nt
		WebElement female_radio=driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
		System.out.println(female_radio.isSelected());	
		WebElement Automation_toolCheckbox= driver.findElement(By.xpath("//input[@type='checkbox' and @id='tool-2' and @value='Selenium Webdriver']"));
		//Boolean checkbox= System.out.println(Automation_toolCheckbox.isSelected());
		driver.close();
	}

}
