package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority=-1)
	public void Test1()
	{
		Reporter.log("hello",true);
	}
	
	@Test(priority=0)
	public void Test2()
	{
		Reporter.log("hello2",true);
	}
	
}
