package day9;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollFunctionalityConcept {

	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Launch the Browser and URL
		
	//We always use Java Executor at the time of scroll functionality
	
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 
	 driver.get("http://demo.guru99.com/test/drag_drop.html");
	 
	 driver.manage().window().maximize();
	
	//Element(Bank) which need to drag
		WebElement From1=driver.findElement(By.xpath("//li[@id='credit2']/a"));
		
		//Element(Debit Side) on which need to drop
		WebElement To1=driver.findElement(By.xpath("//ol[@id='bank']/li"));
		
		//Element(Sales) which need to drag
		WebElement From2=driver.findElement(By.xpath("//li[@id='credit1']/a"));
		
		//Element(Credit Side) on which need to drop
		WebElement To2=driver.findElement(By.xpath("//ol[@id='loan']/li"));
		
		List<WebElement> value5000=driver.findElements(By.xpath("//li[@id='fourth']/a"));
		//Element(5000) which need to drag
		WebElement From3=value5000.get(0);
		
		//Element(Debit Side) on which need to drop
		
		WebElement To3=driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		//Element(5000) which needs to be drag
		WebElement From4=value5000.get(1);
		
		//Element(Credit Side) on which need to drop
		WebElement To4= driver.findElement(By.xpath("//ol[@id='amt8']/li"));
		
		//Using Action Class for drag and Drop
		
		Actions act=new Actions(driver);
		act.dragAndDrop(From1, To1).build().perform();	
		act.dragAndDrop(From2, To2).build().perform();
		act.dragAndDrop(From3, To3).build().perform();
		act.dragAndDrop(From4, To4).build().perform();
		

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Perfect')]"))));
	    // js.executeScript("window.scrollBy(0,500)");
	
	    js.executeScript("argument[0].scrollIntoView(true);",driver.findElement(By.xpath("//a[contains(text(),'Perfect')]")));
	
	  //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	
			
	
	}
	

}
	
	
