package com.pack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSriptUpDown {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://news.google.com/");
		//Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		for(int i=1;i<=5;i++)
		{
			js.executeScript("window.scrollBy(0,1000)");//top to bottom
			js.executeScript("window.scrollBy(0,-1000)");//bottom to top
		}
	}

}
