package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngEx1 {
	
	@Test()
	public void TestA()
	{
		Reporter.log("Hi",true);
	}

}
