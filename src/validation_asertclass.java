	import org.testng.Assert;
import org.testng.annotations.Test;
	
	public class validation_asertclass 
	{
	@Test
	public void assertM()
	{
		String s1= "abc";
		String s2= "abc";
		Assert.assertEquals(s1, s2);
		System.out.println("valid");
	
	}
}