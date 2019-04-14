package day4;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import day11.TakeScreenshotConcept;


public class DragAndDropConcept {

	public static void main(String args[]) 
	{
		
	System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//Launch the Browser and URL
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	TakeScreenshotConcept.screenshotTaken(driver, "0.HomePage");
	driver.manage().window().maximize();
	
	//Element(Bank) which need to drag
	WebElement From1=driver.findElement(By.xpath("//li[@id='credit2']/a"));
	
	//Element(DebitSide) on which need to drop
	WebElement To1=driver.findElement(By.xpath("//ol[@id='bank']/li"));
	
	//Element(Sales) which need to drag
	WebElement From2=driver.findElement(By.xpath("//li[@id='credit1']/a"));
	
	//Element(Credit Side) on which need to drop
	WebElement To2=driver.findElement(By.xpath("//ol[@id='loan']/li"));
	
	List<WebElement> value5000=driver.findElements(By.xpath("//li[@id='fourth']/a"));
	//Element(5000) which need to drag
	WebElement From3=value5000.get(0);
	
	//Element(DebitSide) on which need to drop
	
	WebElement To3=driver.findElement(By.xpath("//ol[@id='amt7']"));
	
	//Using Action Class for drag and Drop
	
	Actions act=new Actions(driver);
	act.dragAndDrop(From1, To1).build().perform();	
	TakeScreenshotConcept.screenshotTaken(driver, "1.draganddrop");
	act.dragAndDrop(From2, To2).build().perform();
	TakeScreenshotConcept.screenshotTaken(driver, "2.draganddrop");
	act.dragAndDrop(From3, To3).build().perform();
	TakeScreenshotConcept.screenshotTaken(driver, "3.draganddrop");
	
	}
}
