package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import day10.TakeScreenshotConcept;

public class DatePickConcept {

	WebDriver driver = null;
	
	@BeforeMethod
	public void setupBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void datepicker() {
		
		
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
		TakeScreenshotConcept.takescreenshot(driver, "1.LoginPage");
		
     	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on Login Button
     	driver.findElement(By.xpath("//input[@type='submit']")).click();
     	TakeScreenshotConcept.takescreenshot(driver, "2.HomePage");
     	driver.switchTo().frame(1);
     	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

     	String date="10-October-2017";
     	
     	String[] datearr=date.split("-");
     	String date1=datearr[0];//22 
     	String month=datearr[1]; //February
     	String  year=datearr[2];//2017
     	WebElement month_select = driver.findElement(By.xpath("//select[@name='slctMonth']"));
     	Select select_month= new Select(month_select);
     	select_month.selectByVisibleText(month);
     	
     	WebElement year_select = driver.findElement(By.xpath("//select[@name='slctYear']"));
     	Select select_year= new Select(year_select);
     	select_year.selectByVisibleText(year);
     	
     	final int totalWeekDays =7;
     	String before_xpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
     	String after_xpath="]/td[";
     	String dayValues=null;
     	for(int rowNum=2;rowNum<=7;rowNum++) 
     	{
     		
     		for(int colNum=1;colNum<=totalWeekDays;colNum++) 
     		{   try {
     			dayValues= driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).getText();
     		} catch(Exception e) {
     			System.out.println("Please Enter the valid date for selection");
     		    break; 
     		}
     			
     			if(dayValues.equals(date1))
     			{
     				driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).click();
     				TakeScreenshotConcept.takescreenshot(driver, "3.CalendarSelection");
     				
     			}
     		}
     		
     		
     	}
     	
     	
	}

	@AfterMethod
	public void teardown() 
	{
		
		driver.quit();
		
		
	}
	
}
