import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploaddemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload");
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.id("file_wraper0"));
		upload.click();
		Runtime rt = Runtime.getRuntime();
		rt.exec("‪D:\\New folder\\fileuploadsele.exe");

	}

}
