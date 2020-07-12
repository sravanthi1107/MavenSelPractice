package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedEx {
  
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     driver.get("http://localhost/login.do");
     WebElement chbox=driver.findElement(By.id("keepLoggedInCheckBox"));
     chbox.click();
     
     boolean b=chbox.isSelected();
     
     if(b)
     {
    	 System.out.println("check box is selected");
     }
     else
    	 System.out.println("checkbox is not selected");
     
	}

}
