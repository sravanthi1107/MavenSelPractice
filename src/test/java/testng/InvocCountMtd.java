package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocCountMtd {
	
	@Test(invocationCount=3)
	public void TestA()
	{
		Reporter.log("TestA",true);
	}

	@Test(invocationCount=-1)
	public void TestB()
	{
		Reporter.log("TestB",true);
	}

	
}
