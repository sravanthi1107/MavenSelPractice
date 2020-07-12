package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
	
	
		public static WebDriver driver;
		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
	     driver.get("C:\\sel-bhanu-html\\enable.html");	
	     WebElement en=driver.findElement(By.id("amt"));
	     boolean e1=en.isEnabled();
	     
	     if(e1)
	     {
	    	 System.out.println("box is enabled");
	    	 en.sendKeys("havisha");
	     }
	     else
	    	 System.out.println("box is disabled");
	     
	     //try catch
	     
//	     try
//	     {
//	    	 en.sendKeys("1000");
//	    	 System.out.println("text box is enabled");
//	     }
//	     catch(InvalidElementStateException e)
//	     { 
//		System.out.println("text box is disabled");
//		}
//		
		}		

}
