import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class amazonscroolscreenshot 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        
	
        JavascriptExecutor js=(JavascriptExecutor)driver;//casting to javascript
    	Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Object item;
		String name = item.getText();
		System.out.println(item.getText());
		screenshotsave.screenshot(driver, name);
	
	}

}
