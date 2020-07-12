package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteKeys {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     driver.get("file:///C:/sel-bhanu-html/copypaste.html");
     WebElement tea=driver.findElement(By.id("t1"));
     WebElement water= driver.findElement(By.id("t2"));
    water.clear();
     tea.sendKeys(Keys.CONTROL+"a"+Keys.CONTROL+"c");
     water.sendKeys(Keys.CONTROL+"v");
     String t1=tea.getAttribute("value");
     String t2=water.getAttribute("value");
     System.out.println(t1);
     System.out.println(t2);
     tea.clear();
     tea.sendKeys("havi");
     water.clear();
     tea.sendKeys(Keys.CONTROL+"ac");
     water.sendKeys(Keys.CONTROL+"v");
     water.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
     
	}

}
