package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertionEx {
	public static WebDriver driver;
	
	@Test
	public void TestA()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	String aTitle=driver.getTitle();
	System.out.println(aTitle);
	String eTitle="actiTIME - Login";
	Assert.assertEquals(aTitle,eTitle);
	//driver.close();
	
//	SoftAssert soft=new SoftAssert();
//	soft.assertEquals(aTitle, eTitle);
//driver.close();
//soft.assertAll();

}
}