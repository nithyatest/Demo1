import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TestNgDemo 
{
@Test
public void demo()
{

	System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	org.testng.Reporter.log("hi",true);
	driver.close();
}
}
