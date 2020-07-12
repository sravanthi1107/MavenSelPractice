package logjpack;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Log4jTest {
	
	public static WebDriver driver;
	final static Logger logger=Logger.getLogger(Log4jTest.class);
	@Test
	public void setup()
	{
		PropertyConfigurator.configure("C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\src\\test\\java\\logjpack\\log4j.properties");
	System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	logger.info("launching Chrome browser");
	driver.get("http://localhost/login.do");
	logger.debug("opening Acti-time url");
	String i= driver.getTitle();
	String e="actiTIME - Login";
	logger.warn("check the title properly");
	System.out.println(i);
	logger.error("title name is not match");
	Assert.assertEquals(i, e);
	logger.fatal("title is old one");
	}
	
	
	
}
