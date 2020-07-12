package extentReport;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenExtentReport
{
	ExtentReports extent;
	 ExtentTest test;
	 WebDriver driver;
	 
	 @BeforeMethod
	 public void Setup()
	 {
		 ExtentHtmlReporter report=new ExtentHtmlReporter("./Reports.learnautotest.html");
		 extent=new ExtentReports();
		 extent.attachReporter(report);
		 test=extent.createTest("Login Acti Test");
		 
	 }
	 
	 @Test
	 public void LoginActi()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://localhost/login.do");
			String a= driver.getTitle();
			String e="actiTIME - Login";
			System.out.println(a);
			Assert.assertEquals(a, e);
		 
	 }
	
	
	@AfterMethod
	public void close(ITestResult res)throws IOException
	{
		if(res.getStatus()==ITestResult.FAILURE)
		{
			String temp=ScreenshotUtil.getScreenshot(driver);
			test.fail(res.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		extent.flush();
		driver.quit();
		
		
	}
}