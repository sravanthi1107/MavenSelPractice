package testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider
	public String[][] getData()
	{
		String[][] a=new String [2][3];
		a[0][0]="UserA";
		a[0][1]="User x";
		a[0][2]="P1";
		a[1][0]="userB";
		a[1][1]="User y";
		a[1][2]="P2";
		return a;
	}
	

	@Test(dataProvider="getData")
	public void Dp(String un,String pw,String ph)
	{
	
		Reporter.log(un+pw+ph);
		
	}
	
	
	
}
