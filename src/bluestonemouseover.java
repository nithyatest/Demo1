import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestonemouseover
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
	List<WebElement> menus=driver.findElements(By.xpath("//a[contains(.,'Rings ')]"));
	Actions a = new Actions(driver);
	Thread.sleep(1000);
	for (WebElement item : menus) 
	{
		String name = item.getText();
		System.out.println(item.getText());
		a.moveToElement(item).build().perform();
		Thread.sleep(1000);
		
		List<WebElement> submenus = driver.findElements(By.xpath("//div/a[contains(.,'Engagement')]"));
		for (WebElement subitemname : menus) 
		{
			System.out.println(subitemname.getText());
		}

		
		}
		
	}

}
