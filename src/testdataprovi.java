import org.testng.annotations.Test;

public class testdataprovi
{
@Test(dataProviderClass = readdata_fromdataprovider.class,dataProvider = "createUser")
	public void test(String user,String pass)
	{
		System.out.println(user);
		System.out.println(pass);
		
	}
}


