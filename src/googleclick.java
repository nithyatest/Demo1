import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class googleclick {

	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
			WebElement java=driver.findElement(By.xpath("//div[@class=\"kno-ecr-pt PZPZlf gsmt\"]/span[text()='Java']"));
			
			

	}


}
