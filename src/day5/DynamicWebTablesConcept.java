package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTablesConcept {

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
     	driver.switchTo().frame(1);
     	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

     	
     	//For Name:
     	
     		//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
     		//*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
     		//*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]/a
     		//*[@id="vContactsForm"]/table/tbody/tr[7]/td[2]/a
     		//*[@id="vContactsForm"]/table/tbody/tr[8]/td[2]/a

     	//	For Checkbox:
     		//*[@id="vContactsForm"]/table/tbody/tr[4]/td[1]/input
     		//*[@id="vContactsForm"]/table/tbody/tr[5]/td[1]/input
     		//*[@id="vContactsForm"]/table/tbody/tr[6]/td[1]/input
     		//*[@id="vContactsForm"]/table/tbody/tr[7]/td[1]/input

     	
     	//Method 1:
     	
     	String before_xpath ="//*[@id='vContactsForm']/table/tbody/tr[";
     	String after_xpath ="]/td[2]/a";

     	for(int i =4;i<=8;i++) {
     		    		
     		String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
     		System.out.println(name);
     		if(name.contains("a11")) {
     			
     			driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr["+i+"]/td[1]/input")).click();
     		}
     	}
     	  	
     	//Method 2:
     	
     	driver.findElement(By.xpath("//a[contains(text(),'test 1')]/parent::td//preceding-sibling::td/input[@name='contact_id']")).click();
     	driver.findElement(By.xpath("//a[contains(text(),'a11')]//parent::td//parent::tr/td[5]")).click();
	}

}
