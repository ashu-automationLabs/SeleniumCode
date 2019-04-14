package testNG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.TestUtil;

public class DataProviderConcept {

	WebDriver driver;

@BeforeMethod
public void setup() 
{   System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}

//The purpose of this method is to fetch the data from the excel sheet store it in here
//What exactly the DataProvider returns??? -<<< V V Imp Object[][]
@DataProvider
public Iterator<Object[]> getdata() 
{
	ArrayList<Object[]> testdata=TestUtil.getDataFromExcel("signup");
    return testdata.iterator();   
}


@Test(dataProvider="getdata")
public void Signup(String FName,String LName,String Mobile_No,String Password) 
{
	WebElement fName=driver.findElement(By.name("firstname"));
	fName.clear();
	fName.sendKeys(FName);
	WebElement lName=driver.findElement(By.name("lastname"));
	lName.clear();
	lName.sendKeys(LName);
	WebElement mobile=driver.findElement(By.name("reg_email__"));
	mobile.clear();
	mobile.sendKeys(Mobile_No);
	WebElement newpass=driver.findElement(By.name("reg_passwd__"));
	newpass.clear();
	newpass.sendKeys(Password);


}


@AfterMethod
public void teardown() 
{
	driver.close();

}
	
	

}
