

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locationdemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		Point loc= email.getLocation();
		System.out.println(loc);
		int x=loc.getX();
		int y=loc.getY();
		System.out.println(x +" "+ y);
		
	}

}
