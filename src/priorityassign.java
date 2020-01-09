import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class priorityassign 
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

	@org.testng.annotations.Test(priority = 2)
	public void demo() {
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
		org.testng.Reporter.log("demo", true);

	}

	@org.testng.annotations.Test(priority = 1)

	public void demo1() {
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		org.testng.Reporter.log("demo1", true);
	}
   

	@org.testng.annotations.Test(enabled =false)

	public void demo2() {
		driver.findElement(By.name("q")).sendKeys("qspider", Keys.ENTER);
		org.testng.Reporter.log("demo1", true);
	}
   
	
	
	@AfterMethod
	private void after() {
		driver.close();
	}
}


