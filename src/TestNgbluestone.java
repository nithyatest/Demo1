import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgbluestone
{
@Test
System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.bluestone.com/");	
Thread.sleep(1000);
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[contains(.,'10+1 Monthly Plan')]")).click();
driver.findElement(By.xpath("//input[@id='gmsStart']")).click();
Alert a=driver.switchTo().alert();

Reporter.log(a.getText());
a.accept();
}
