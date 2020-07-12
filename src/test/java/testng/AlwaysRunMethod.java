package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunMethod {
	
	@Test(dependsOnMethods= {"deleteUser","editUser"},alwaysRun=true)
	public void registerUser()
	{
		//
		
		//Assert.fail();
		Reporter.log("Reporter",true);
	}
	
	@Test()
	public void deleteUser()
	{
		Assert.fail();
		Reporter.log("deleteuser",true);
	}
	
	@Test()
	public void editUser()
	{
		Assert.fail();
		Reporter.log("Edituser",true);
	}
	

}
