package com.pack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListElemenentsMethod {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium");
		List<WebElement> lw=driver.findElements(By.xpath("(//span[contains(.,'selenium')])"));
		for(int i=0;i<lw.size();i++)
		{
			System.out.println(lw.size());
			String text=lw.get(i).getText();
			System.out.println(text);
		}
		
	}

}
