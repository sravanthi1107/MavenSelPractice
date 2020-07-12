package com.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutClick {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("(//div[contains(.,'Login')])[2]")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER
				);

	}

}
