package com.pack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrwex2 {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.linkText("Actimind Inc.")).click();
		Set<String> chw=driver.getWindowHandles();
		for(String c:chw)
		{
			driver.switchTo().window(c);
		}
		driver.findElement(By.xpath("//a[contains(.,'Contacts')]")).click();
		driver.quit();

	}

}
