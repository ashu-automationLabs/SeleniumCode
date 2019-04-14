package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenApproch {
     
	static WebDriver driver= null;
	public static void main(String args[]) throws Exception {
		
	   Properties prop= new Properties();
	   File filename = new File("E:\\JavaLearning\\SeleniumBanglore\\src\\day5\\config.properties");
	   FileInputStream fis= new FileInputStream(filename); 
	   prop.load(fis);	
		
	   if(prop.getProperty("Browser").equals("Chrome")) {
		
	    System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		
	   }else if(prop.getProperty("Browser").equals("FF")) {
		   System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		   driver = new FirefoxDriver();
		   
		   
	   }
	   
		//Launch the Browser and URL
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		
		//Enter the username and Password 
		WebElement usernamefield= driver.findElement(By.name("email"));
		usernamefield.clear();
		usernamefield.sendKeys(prop.getProperty("username"));
		WebElement passwordfield = driver.findElement(By.name("pass"));
		
		passwordfield.clear();
		passwordfield.sendKeys(prop.getProperty("password"));
		
		
	}
}
