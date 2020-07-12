package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEx {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("C:\\sel-bhanu-html\\table.html");	
		 List<WebElement> we=driver.findElements(By.xpath("//td"));
//		 for(int i=0;i<we.size();i++)
//		 {
//			 String text=we.get(i).getText();
//			 System.out.println(text);
//		 }
		 for(WebElement i1:we)
		 {
			 System.out.println(i1.getText());
		 }
	}

}
