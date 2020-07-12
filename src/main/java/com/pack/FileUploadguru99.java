package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadguru99 {
	public static WebDriver driver;
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\sel-bhanu-html\\select-sort.txt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
	}

}
