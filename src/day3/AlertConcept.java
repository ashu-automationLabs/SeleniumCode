package day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch the Browser and URL
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		//To maximize the browser window  
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1212");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
		//1.We have to switch the driver to the Alerts by using switch alert
		//2.Operation: Accept, reject/dismiss/sendkeys/get text
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert al=driver.switchTo().alert();
	    al.dismiss();
	    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1212");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	    System.out.println(al.getText());
		al.accept();

	}

}
