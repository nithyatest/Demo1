import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		// driver.get("https://sites.google.com/a/chromium.org/chromedriver/");
		// driver.navigate().to("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		// System.out.println("loading url");
		// Thread.sleep(2000);
		// driver.navigate().back();
		// Thread.sleep(5000);
		// driver.navigate().forward();
		// driver.close();
		// System.out.println("closeing browser");
		// driver.quit();
		// String url =driver.getCurrentUrl();
		// System.out.println(url);
		// System.out.print(driver.getTitle());
	/*	WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("shardha");
	    WebElement pass=driver.findElement(By.id("pass"));
	    pass.sendKeys("kapoor");
	    WebElement log_int= driver.findElement(By.id("loginbutton"));
	    log_int.click();*/
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Abc");
		WebElement email=driver.findElement(By.xpath("//label[@for='email'] "));
		String name=email.getText();
		System.out.println(name);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(name);
		
		WebElement pass=driver.findElement(By.xpath("//label[@for='pass']"));
		System.out.println(pass.getText());
		String password=pass.getText();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		
		
		

	}
}
