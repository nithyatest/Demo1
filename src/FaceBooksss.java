import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FaceBooksss 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
	File screensave = new File(".\\screnshot\\FaceBook.png");
	Files.copy(screenshot, screensave);

	}

}
