package pom.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestFEPom {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		FindElementsPom fp=new FindElementsPom();
		PageFactory.initElements(driver,fp);
		
		fp.countLinks();
		driver.close();
	}

}
