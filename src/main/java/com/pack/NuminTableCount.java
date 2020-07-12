package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NuminTableCount {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("C:\\sel-bhanu-html\\table.html");
		 List<WebElement> le=driver.findElements(By.xpath("//td"));
		 int count=0,sum=0;
		 for(int i=0;i<le.size();i++)
		 {
			 
			 String text=le.get(i).getText();
			 
			 try
			 {
				 int v=Integer.parseInt(text);
				 System.out.println(v);
				 count++;
				 sum=sum+v;
				 
			 }
			 catch(NumberFormatException e)
			 {
				 
			 }
			 System.out.println("-----------");
		 }
		 System.out.println("count is"+count);
		 System.out.println("sum is"+sum);
	}

}
