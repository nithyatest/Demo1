import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class actitimenotific
{
//popup display and then display on console that output
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("launching actitime");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		driver.findElement(By.xpath("//div[@class=\"popup_menu_button popup_menu_button_support\"]")).click();
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
		WebElement txt=driver.findElement(By.xpath("//span[contains(.,'© 2019 actiTIME Inc. All rights reserved.')]"));
		System.out.println(txt.getText());
						
		


	}

}
