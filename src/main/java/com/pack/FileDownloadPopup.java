
package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadPopup {
	
public static WebDriver driver;
	public static void main(String[] args)
	{

	System.setProperty("webdriver.gecko.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\geckodriver.exe");
	FirefoxProfile profile=new FirefoxProfile();
	profile.setPreference("browser.helperApps.neverAsksavetoDisk", "application/zip");
	//WebDriver driver=new FirefoxDriver(profile);
	driver.get("http://docs.seleniumhq.org/download/");
	driver.findElement(By.id("close")).click();
	driver.findElement(By.xpath("//td[.='Java']/../td[4]/a")).click();
	
	}

}
