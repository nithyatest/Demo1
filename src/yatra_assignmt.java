import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatra_assignmt {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//input[@id=\"BE_flight_origin_city\"]")).sendKeys("Newdelhi",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id=\"BE_flight_arrival_city\"]")).sendKeys("Bangalore",Keys.ENTER);
        driver.findElement(By.xpath("//td[@id=\"06/01/2020\"]")).click();;

	}

}
