import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(DemoList.class)
public class google_lister_assignmt 
{
	static WebDriver driver;


@BeforeMethod

	public void beforeM() {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println("Bfore method");

	}

	@org.testng.annotations.Test
	public void demo() {
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
		org.testng.Reporter.log("demo", true);

	}
	@AfterMethod
	private void after() {
		driver.close();
	}
	
}
