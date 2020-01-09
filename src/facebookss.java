import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class facebookss {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Screenshot = ts.getScreenshotAs(OutputType.FILE);
		File ScreenSave = new File(".\\screenshot\\facebook.png");
		Files.copy(Screenshot, ScreenSave);

	}

}
