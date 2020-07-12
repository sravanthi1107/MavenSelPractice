package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MousehoverAction1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/mouse-hover-action/");
		driver.manage().deleteAllCookies();
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Tutorial')]")).click();
		
		WebElement w1=driver.findElement(By.xpath("//span[contains(text(),'QA Practices')]"));
		action.moveToElement(w1).build().perform();;
		
		WebElement w2=driver.findElement(By.xpath("(//span[contains(.,'Software Testing')])[2]"));
		action.moveToElement(w2).click().build().perform();;
		
	}

}
