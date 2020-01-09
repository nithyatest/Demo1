import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class bluestone 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@title='Jewellery']")).click();
		List<WebElement> menu =driver.findElements(By.xpath("//a[@title='Kadas']"));
				Thread.sleep(20000);
				Actions a=new Actions(driver);
				a.doubleClick(kadas).perform();

	}

}
