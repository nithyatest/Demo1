import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //driver.navigate().to("https://www.google.com/");
        String url =driver.getCurrentUrl();
		System.out.println(url);
		System.out.print(driver.getTitle());

	}

}
