package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame1Ex {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestinghelp.com/");
		driver.manage().window().maximize();
		
		List<WebElement> iframes=driver.findElements(By.tagName("iframes"));
		int count=iframes.size();
		
		System.out.println(count);
		
		for(WebElement e:iframes)
		{
			System.out.println(e.getText());
		}
		
		
	}

}
