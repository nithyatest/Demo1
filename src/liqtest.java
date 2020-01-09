import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class liqtest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://iqgenie.org");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//i[@id='userIcon']")).click();
		WebElement mob=driver.findElement(By.xpath("//input[@id='username']"));
		mob.sendKeys("1234567890");
		
		

	}

}
