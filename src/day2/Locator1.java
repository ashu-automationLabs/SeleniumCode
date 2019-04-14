package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch URL
		driver.get("https://www.google.com");
		//Locator LinkText
		//driver.findElement(By.linkText("Gmail")).click();
        //Locator Partial Linktext
		//driver.findElement(By.partialLinkText("Gm")).click();
		
		// Locator ClassName 
		String text=driver.findElement(By.className("b0KoTc")).getText();
		System.out.println(text);
		
		driver.close();

	}

}
