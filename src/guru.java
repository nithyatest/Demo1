import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/v1/index.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		
		
	

	}

}
