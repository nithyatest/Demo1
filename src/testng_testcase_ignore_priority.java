import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class testng_testcase_ignore_priority
	{
	static WebDriver driver;//globaly declared webdriver
	
	@BeforeMethod
	public void beforeM()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println("Bfore method");
	}
	
	
	@Test(priority = 3)//priority is  execution number for the pgm
	public void testcase1()
	{
		driver.findElement(By.name("q")).sendKeys("corejava", Keys.ENTER);
		Reporter.log("demotestcase1",true);
	}
	
	@Test(enabled = false)//enabled false  is used for disabling the testcase(pgm method)
	public void testcase2()
	{
		
		driver.findElement(By.name("q")).sendKeys("c++", Keys.ENTER);
		Reporter.log("demotestcase2",true);
	}
	
	@Test(priority = 1)
	public void testcase3()
	{
		driver.findElement(By.name("q")).sendKeys("python", Keys.ENTER);
		Reporter.log("demotestcase3",true);
		
	}
	
	
	@AfterMethod
	public void after()
	{
		driver.close();
	}
	
	}
