import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sun.text.normalizer.NormalizerImpl.ReorderingBuffer;

public class dataprovider 
{
	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[3][2];//mentioning no of rows and column
		data[0][0]="user A";
		data[0][1]="A1";
		
		data[1][0]="user B";
		data[1][1]="B1";
		
		data[2][0]="user C";
		data[2][1]="C1";
		
		return data;
		
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un,String Pw)
	{
		Reporter.log("create:"+ un + "pwd" + Pw,true);
	}

}
