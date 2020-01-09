import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown
{

	public static void main(String[] args) throws InterruptedException 
	{
		
			System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://selenium.dev/");
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");//for y index
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,-1000)");//down to top
			Thread.sleep(5000);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(5000);
			js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}

}
