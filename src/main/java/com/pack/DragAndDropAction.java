package com.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Actions action=new Actions(driver);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
WebElement b1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
WebElement b2=driver.findElement(By.xpath("//h1[text()='Block 3']"));

action.dragAndDrop(b1, b2).build().perform();
WebElement b4= driver.findElement(By.xpath("//h1[text()='Block 4']"));
action.dragAndDropBy(b4, 10,50).build().perform();
		
		
		
	}

}
