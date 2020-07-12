package com.pack;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDiviPopup {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//SimpleDateFormat s=new SimpleDateFormat("dd");
		//String v=s.format(new Date());
		//System.out.println(v);
		driver.findElement(By.xpath("//span[contains(.,'DEPARTURE')]")).click();
		driver.findElement(By.xpath("//div[.='May 2020']/..//p[.='22']")).click();
		
		
		
	}
	
	
	
	
}
