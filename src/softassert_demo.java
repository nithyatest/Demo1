import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	public class softassert_demo 
	{
	@Test
	public void demo()
	{
		List lst=new ArrayList<>();
		lst.add("Nithya");
		lst.add("kp");
		lst.add(2);
		lst.add("abc");
	    lst.add(true);
		

		List lst1=new ArrayList<>();
		lst.add("Nithya");
		lst.add("kp");
		lst.add(22);
		lst.add("abc");
	    lst.add(true);
	    
	    Assert.assertEquals(lst,lst1);//checking actual result and expected result
	   SoftAssert sa=new SoftAssert();
	   sa.assertEquals(lst, lst1);
	   Reporter.log("Hello",true);
       sa.assertAll();//
	    
		
	}
	}
