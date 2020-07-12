package pom.framework.script;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest  {
	public static WebDriver driver;
	public static Properties prop;
	public BaseTest()
	{
	prop=new Properties();
	try {
	FileInputStream fis=new FileInputStream("C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\src\\test\\java\\pom\\framework\\utilities\\config.properties");
	prop.load(fis);
	}
	catch(Exception e) 
	{
	e.printStackTrace();
	}}
	
@BeforeMethod
	public void initialization()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}	
	
	@AfterMethod
	public void shutdown()
	{
		driver.quit();
	}
}
	
