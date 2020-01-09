import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class blustone_below_priceassignt 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
        driver.findElement(By.xpath("//input[@id=\"search_query_top_elastic_search\"]")).sendKeys("Rings",Keys.ENTER);
       
        WebElement price=driver.findElement(By.xpath("//section/span[contains(.,'Price')]"));
         Actions a = new Actions(driver);
         a.moveToElement(price).build().perform();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//span[@data-displayname=\"below rs 10000\"]")).click();
        
	}

}
