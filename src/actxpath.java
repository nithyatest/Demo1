import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class actxpath 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement txt=driver.findElement(By.xpath("//td[@id=\'headerContainer\']"));
		System.out.println(txt.getText());
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(txt);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys();
		Thread.sleep(3000);
		WebElement msg=driver.findElement(By.xpath("//td[@valign=\"top\"]/span[@class\"errormsg\"])");	
		System.out.println(msg.getText());
		

	}

}
