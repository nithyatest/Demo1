import java.io.Closeable;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	System.out.println("launching");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.Naukri.com/");
	String parent =driver.getWindowHandle();
	System.out.println(parent);
	Set<String> wins = driver.getWindowHandles();
	//wins.remove(parent);
   // for (String win : wins) 
   // {
    //	System.out.println(win);
   // driver.switchTo().window(win);
    	//driver.close();
//System.out.println(wins.getClass());
	ArrayList<String> al= new ArrayList<String>(wins);
	for(int i=al.size()-1;i>=0;i--)
	{
		driver.switchTo().window(al.get(i)).close();
	}
	}
	
}
//}


