import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googledropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		
			System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			 driver.get("https://www.google.com/");
			 Thread.sleep(10000);
			 WebElement search= driver.findElement(By.name("q"));
				search.sendKeys("java",Keys.ENTER);
			 

	}

}
