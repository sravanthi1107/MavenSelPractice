package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Top2BtmReverseSelect {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("C:\\sel-bhanu-html\\select-fb.html");
		 Select drpdwn=new Select(driver.findElement(By.id("mtr")));
		 for(int i=0;i<drpdwn.getOptions().size();i++)
		 {
			 drpdwn.selectByIndex(i);
		 }
		 for(int i=drpdwn.getOptions().size()-1;i>=0;i--)
		 {
			 drpdwn.deselectByIndex(i);
		 }
	}

}
