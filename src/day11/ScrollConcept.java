package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollConcept {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumhq.org/");
		
		Thread.sleep(3000);
		//1.Using Pixel
		//js.executeScript("scroll(0,1000)");
		
		//2.Using Visibility of an Element
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'sponsor the')]")));
		
		
		js.executeScript("argument[0].scrollIntoView();",driver.findElement(By.xpath("//a[contains(text(),'sponsor the')]")));
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
