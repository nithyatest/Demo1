
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouserover {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		for (WebElement item : menu) {
			String name = item.getText();//screenshot name declaration
			System.out.println(item.getText());
			a.moveToElement(item).build().perform();
			Thread.sleep(1000);
			screenshotsave.screenshot(driver, name);// taking screeshot for mouse overaction
			List<WebElement> submenu = driver.findElements(By.xpath("//span[contains(.,'Sale')]/parent::li/descendant::ul[@class=\"taxonslist\"]"));
			for (WebElement subitemname : menu) {
				System.out.println(subitemname.getText());
			}

		}
	}

}
