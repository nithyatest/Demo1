import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.google.common.io.Files;

public class screenshotsave {

	public static void screenshot(WebDriver driver,String name) throws IOException
	
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Screenshot = ts.getScreenshotAs(OutputType.FILE);
		File ScreenSave = new File(".\\screenshot\\"+ name +".png");
		Files.copy(Screenshot, ScreenSave);	
		}
	
	

}
