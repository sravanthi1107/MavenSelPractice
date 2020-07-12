package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	
	@Test
	public void FBTest()
	{
		System.out.println("print Fb TestCases");
		Assert.assertEquals("havi","havi");
		
	}
	
	@Test
	public void GmailTest()
	{
		System.out.println("Gmail TestCases ");
		Assert.assertEquals("havi", "srav");
	}
}
