import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdemo 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("file:///C:/Users/user/Desktop/select.html");
        WebElement opt=driver.findElement(By.xpath("//select[@id='a']"));
        Select s= new Select(opt);
        List<WebElement> values=s.getOptions();
        for (WebElement data : values)
        {
        	System.out.println(data.getText());
		}
        	WebElement opt=driver.findElement(By.xpath("//select[@id='b']"));
        	Select s=new Select(opt);
        	List<WebElement> values=s.getOptions();
        	if(s.isMultiple())
        		for (WebElement data : values) 
        		{
				System.out.println(data.getText());
				s.selectByValue(data.getText());
				}
        	Thread.sleep(2000);
        	System.out.println("==========="+s.getFirstSelectedOption().getText());
        	List<WebElement> selectopt=s.getAllSelectedOptions();
        	for (WebElement val : selectopt) 
        	{
        		System.out.println(val.getText());
			}
        	s.deselectAll();
	}
        
	

}
