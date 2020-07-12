package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerClass extends TestListenerAdapter 
{
	public void onTestStart(ITestResult tr)
	{
		System.out.println("Testcase is started");
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Testcase is success");
	}
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Testcases is Failed");
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Testcase is Skipped");
	}
	
	

}
