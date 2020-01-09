import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urbanladder {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		//WebElement decor = driver.findElement(By.xpath("//li/span[contains(.,'Decor')]"));
		//System.out.println(decor.getText());
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]"));
		////span[contains(.,'Sale')]/parent::li/descendant::ul[@class='taxonslist']   
		for (WebElement item : ele) 
		{
			System.out.println(item.getText());
		}
		

	}

}
