package pom.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		LoginPage l=new LoginPage(driver);
		l.SetUsername("admin");
		l.SetPassword("manager");
		l.ClickLogin();
		
		
		l.SetUsername("abc");
		l.SetPassword("xyz");
		l.ClickLogin();
		
				
		
		
	}

}
