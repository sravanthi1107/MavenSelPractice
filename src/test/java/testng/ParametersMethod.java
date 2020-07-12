package testng;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersMethod {

	@Parameters({"city","area"})
	@Test
	public void TestA(String city,String area)
	{
		Reporter.log(city,true);
		Reporter.log(area,true);
	}
}
