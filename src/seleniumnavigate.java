import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumnavigate 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		WebElement ele=driver.findElement(By.xpath("//input[@name='search']"));
		ele.sendKeys("Testing",Keys.ENTER);
		driver.navigate().back();
		ele.sendKeys("java",Keys.ENTER);
		

	}

}
