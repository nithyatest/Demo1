package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFlipkartHome {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		FlipkartHome fh=new FlipkartHome(driver);
		Thread.sleep(2000);
		fh.searchTxt("iphone");
		fh.clickB();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		fh.searchTxt("Nike");
		fh.clickB();
		
		
		
		
	}

}
