package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEX1 {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("C:\\Users\\SravanthiThota\\Desktop\\RIT-PROJECT\\Sravs-Personal\\DemoA.html");
		
		WebElement un=driver.findElement(By.xpath("//input[@type='text']"));
		un.click();
		un.clear();
		un.sendKeys("loku");
		WebElement pw=driver.findElement(By.xpath("//input[@type='passowrd']"));
		pw.click();
		pw.clear();
		pw.sendKeys("havi");
		WebElement login=driver.findElement(By.xpath("//input[@type='button']"));
		login.click();
		

	}

}
