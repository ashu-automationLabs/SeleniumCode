package day6;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdbcTest extends JdbcConnection {

	public static void main(String[] args) throws SQLException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch the Browser and URL
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		
		String UName= dbconnection("SELECT username FROM employee.user where user_id=101", "username");
		String Pass= dbconnection("SELECT password FROM employee.user where user_id=101", "password");
		//Enter the user credentials
		WebElement Username = driver.findElement(By.name("username"));
		Username.clear();
		Username.sendKeys(UName);
		WebElement Password = driver.findElement(By.name("password"));
		Password.clear();
		Password.sendKeys(Pass);
     	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click on Login Button
     	driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
