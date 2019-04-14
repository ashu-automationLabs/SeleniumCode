package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SwitchBetweenTabsConcept {

	@Test
	public static void switchTabs() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch the Browser and URL
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(text(),'Apply now')]")).click();
        
        String MainWindow=driver.getWindowHandle();
        System.out.println("Main Window Title: "+driver.getTitle());
        
        WebElement Home_Loan=driver.findElement(By.xpath("//a[contains(text(),'Home Loan') and @class='mainlink']"));
        Actions action = new Actions(driver);
        action.moveToElement(Home_Loan).click().build().perform();
        
        Set<String> strHandles=driver.getWindowHandles();
        
        for(String handle:strHandles) {
        	
        	driver.switchTo().window(handle);
        	String strTitle= driver.getTitle();
        	
        	if(strTitle.equalsIgnoreCase(": HDFC BANK :")) {
        		
        		System.out.println(driver.getTitle());
        		try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys("Ashutosh");
        		
        	}
        	
        	
        } driver.close();
		driver.switchTo().window(MainWindow);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[contains(text(),'Apply now')]")).click();
		Thread.sleep(2000);
		Home_Loan.click();
	}
}
