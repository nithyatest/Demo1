package Testpom;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pom.FlipkartHome;
import pom.flipkartassignmentpom;

public class flipkartassignmentmain 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
				flipkartassignmentpom fh= new flipkartassignmentpom(driver);
		Thread.sleep(2000);
				Actions a=new Actions(driver);
		Thread.sleep(1000);
		
		fh.mouseover(a);
		Thread.sleep(2000);
				fh.clickB();
		Thread.sleep(20000);
				
		fh.phoneclick();
		Thread.sleep(2000);
				Set<String> win=driver.getWindowHandles();
		for (String child : win) 
		{
		driver.switchTo().window(child);

		}
		flipkartassignmentpom fh1= new flipkartassignmentpom(driver);
		System.out.println("Tab switch");
		Thread.sleep(20000);
		
		fh.clickadd();
		
		System.out.println("Add to cart");


	}

}
