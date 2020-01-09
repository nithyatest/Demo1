import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);																																																																																																																																																																																																																																	
		driver.close();
	}

}
