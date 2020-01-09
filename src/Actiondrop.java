import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondrop
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("http://jqueryui.com");
	 Thread.sleep(2000);
	 WebElement frame=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	 driver.switchTo().frame(frame);
	 WebElement slider=driver.findElement(By.xpath("//div[@class=\"ui-widget-header ui-droppable ui-state-highlight\"]"));
	 
	 Actions a=new Actions(driver);
	 a.dragAndDropBy(slider, 50, 0).perform();
	 
	}
}