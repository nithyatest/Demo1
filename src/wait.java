import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class wait //synchranization method
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebDriverWait ww=new WebDriverWait(driver, 25);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java",Keys.ENTER);
		ww.until(ExpectedConditions.titleContains("java"));
		driver.close();

	}

}
