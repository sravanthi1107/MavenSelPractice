package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectdropdown {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("C:\\sel-bhanu-html\\select-fb.html");
		 Select drpdwn=new Select(driver.findElement(By.id("mtr")));
	drpdwn.selectByIndex(0);
	if(drpdwn.isMultiple())
	{
		drpdwn.deselectByIndex(0);
	}
	else
		System.out.println("it is not multiselect");
		 
	}

}
