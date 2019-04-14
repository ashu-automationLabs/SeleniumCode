package doubts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch the Browser and URL
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		//Enter credentials
		//Enter the user credentials
		WebElement Username = driver.findElement(By.name("username"));
		Username.clear();
		Username.sendKeys("sharma11");
		WebElement Password = driver.findElement(By.name("password"));
		Password.clear();
		Password.sendKeys("test123");
     	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on Login Button
     	driver.findElement(By.xpath("//input[@type='submit']")).click();
     	driver.switchTo().frame("mainpanel");
     	
     	WebElement contact= driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
     	WebElement New_Contact=driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
     	Actions action=new Actions(driver);
     	action.moveToElement(contact).build().perform();
      	action.moveToElement(New_Contact).click().build().perform();
      	
      	WebElement title_dropdown=driver.findElement(By.xpath("//select[@name='title']"));
      	
      	Select title = new Select(title_dropdown);
      	title.selectByVisibleText("Miss");
      	
	
	}
	
}
