package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch the Browser and URL
		driver.get("https://www.facebook.com/");
		//To maximize the browser window  
		driver.manage().window().maximize();
		
		WebElement Forgetten= driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		
		//WebElement Gold_Loan=driver.findElement(By.xpath("//a[contains(text(),'Home Loan') and @class='mainlink']"));
		
		Actions action = new Actions(driver);
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//action.moveToElement(Gold_Loan).click().build().perform();
		action.contextClick(Forgetten);
		
		driver.close();
	}

}
