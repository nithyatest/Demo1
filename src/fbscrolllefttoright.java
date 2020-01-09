import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbscrolllefttoright 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(500,0)");//left to right
		//Thread.sleep(2000);
		//js.executeScript("window.scrollBy(-500,0)");//right to left
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
	}

}
