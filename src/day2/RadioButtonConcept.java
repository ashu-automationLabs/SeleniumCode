package day2;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RadioButtonConcept {

	@Test
	public void SignUpFB() {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch the Browser and URL
		driver.get("https://www.facebook.com");
		//To maximize the browser window  
		driver.manage().window().maximize();
		
		//Radio Button
		
		List<WebElement> radiobtn= driver.findElements(By.xpath("//input[@type='radio']"));
	    radiobtn.get(0).click();
	    radiobtn.get(1).click();
	     
	    //male button
	    driver.findElement(By.xpath("//input[@value='2']")).click();
	   
	    //DropDown-Operation
	    WebElement day= driver.findElement(By.id("day"));
	    WebElement month= driver.findElement(By.id("month"));
	    WebElement Year= driver.findElement(By.id("year"));
	    
	    Select day_dropdown = new Select(day);
	    day_dropdown.selectByIndex(12);
	    Select month_dropdown = new Select(month);
	    month_dropdown.selectByValue("7");
	    Select year_dropdown = new Select(Year);
	    year_dropdown.selectByVisibleText("2013");
	}

}
