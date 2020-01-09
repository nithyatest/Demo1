import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.java.util.jar.pack.Package.Class.Method;

public class getmethod implements WebDriver
{
	@Override
		public void get(String url)
	{
			// TODO Auto-generated method stub
			
		}
	@Override
	public String getCurrentUrl() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<WebElement> findElements(By arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Navigation navigate() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Options manage() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

	public static void main(String[] args)
	{
		getmethod g=new getmethod();
		Class c1=g.getClass();
		Method[] meth=c1.getMethods();
		for (java.lang.reflect.Method name : meth) 
		{
		System.out.println(name.toString());	
		}
		
			
		
		

	}

}
