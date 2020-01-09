import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class gmail 
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.gmail.com/");
	  System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.id("identifierId"));
		gmail.sendKeys("qsp4test");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("password",Keys.ENTER);
		
	
	    
	  
  
  }
}
