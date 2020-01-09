import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(DemoList.class)
	public class demo2list 
	{
	@Test
	public void Demo()
	{
	System.out.println("Hi");	
	
	}
	@Test
	public void Demo1()
	{
	System.out.println("Hi1");
	//Assert.fail();

}

}
