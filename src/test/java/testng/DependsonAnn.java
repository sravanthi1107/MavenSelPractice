package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DependsonAnn {

	@Test(dependsOnMethods= {"deleteUser","editUser"})
	public void registerUser()
	{
		//
		
		//Assert.fail();
		Reporter.log("Reporter",true);
	}
	
	@Test()
	public void deleteUser()
	{
		//Assert.fail();
		Reporter.log("deleteuser",true);
	}
	
	@Test()
	public void editUser()
	{
		Reporter.log("Edituser",true);
	}
	
}
