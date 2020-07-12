package com.pack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionSize {
  
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     driver.get("https://www.google.com/");
     Thread.sleep(2000);
     Dimension d=new Dimension( 350,400);
     driver.manage().window().setSize(d);
    Thread.sleep(2000);
    Point p=new Point(300,200);
    driver.manage().window().setPosition(p);
    Thread.sleep(2000);
    driver.manage().window().maximize();
    driver.close();
	}

}
