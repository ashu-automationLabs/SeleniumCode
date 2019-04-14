package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickConcept {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch the Browser and URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Username= driver.findElement(By.xpath("//img[contains(@src,'GwFs3')]"));
		Actions action = new Actions(driver);
		action.contextClick(Username).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}
	
}
