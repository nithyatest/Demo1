import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sun.swing.internal.plaf.basic.resources.basic;

public class acttime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//System.out.println("launching browser");
		//Thread.sleep(2000);
		String home=driver.getTitle();
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		//Thread.sleep(5000);
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		Thread.sleep(2000);
		String login = driver.getTitle();
		System.out.println(home+" "+login);
		
	//	if (!home.equals(login)) 
		//{
		//	System.out.println("Login done");
			//driver.findElement(By.id("logoutLink")).click();
		//}
		//String logout =driver.getTitle();
		//if(home.equals(logout))
		//	System.out.println("logout");
		
	}
}
