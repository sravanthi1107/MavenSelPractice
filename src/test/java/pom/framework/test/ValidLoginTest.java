package pom.framework.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.framework.pages.LoginPage;
import pom.framework.pages.LogoutPage;
import pom.framework.script.BaseTest;

public class ValidLoginTest extends BaseTest {
	
	
	
	
	@Test
	public void testLogin()
	{
	LoginPage l=new LoginPage(driver);
	
	l.getUsername(prop.getProperty("username"));
	l.getPassword(prop.getProperty("password"));
	l.clickLogin();

	LogoutPage lg=new LogoutPage(driver);
	lg.help();
	lg.aboutAct();
	lg.Product();
	lg.Close();
	lg.Logout();
	
	}
	
	
}
