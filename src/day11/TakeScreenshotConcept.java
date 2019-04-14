package day11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshotConcept {

	public static void screenshotTaken(WebDriver driver,String filename) {
		
		TakesScreenshot ss=(TakesScreenshot)driver;
        File source=ss.getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(source, new File("./Screenshot/"+filename+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
