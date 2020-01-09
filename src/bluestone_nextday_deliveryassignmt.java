import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestone_nextday_deliveryassignmt
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//input[@id=\"search_query_top_elastic_search\"]")).sendKeys("Rings",Keys.ENTER);
		driver.findElement(By.xpath("//section[@id=\"Price-form\"]/span[@class=\"title style-fill i-right\"]")).click();  

	}

}
