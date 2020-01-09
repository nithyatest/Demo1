import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		
		

	}

}
