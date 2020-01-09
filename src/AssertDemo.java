import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

	public class AssertDemo
	{
	@Test
	public void assertDemo()
	{
	List lst=new ArrayList<>();
	lst.add("abc");
	lst.add(9);
    lst.add(true);
    
    List lst1=new ArrayList<>();
    lst.add("abc");
	lst.add(19);
    lst.add(true);  
    Assert.assertEquals(lst,lst1);//checking actual result and expected result
    System.out.println("hello");
    

}
}
