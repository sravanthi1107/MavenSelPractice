package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTableContent {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("C:\\sel-bhanu-html\\table.html");
		 List<WebElement> allTR=driver.findElements(By.tagName("tr"));
		 
		 for(int i=0;i<allTR.size();i++)
		 {
			 WebElement tr=allTR.get(i);
			 List<WebElement> allTD=tr.findElements(By.tagName("td")); 
			 
			 for(int j=0;j<allTD.size();j++)
			 {
				 String text=allTD.get(j).getText();
                System.out.print(text+"");
			 }
			 System.out.println();
		 }
		 
	}

}
