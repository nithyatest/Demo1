import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class blustoneverifylogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");	
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(.,'10+1 Monthly Plan')]")).click();
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("qsp4test@gmail.com",Keys.ENTER);
		        driver.close();
	}

}
