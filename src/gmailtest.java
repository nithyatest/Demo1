import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailtest 
{

	public static void main(String[] args) throws InterruptedException
   {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");	
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.xpath("//input[@type='email']"));
				gmail.sendKeys("qsp4test");
		driver.findElement(By.xpath("//span[@class='CwaK9']/span[contains(.,'Next')]")).click();
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("qtest@123");
		
		
		
   }

}
