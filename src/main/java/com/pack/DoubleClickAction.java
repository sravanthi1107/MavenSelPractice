package com.pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Actions action=new Actions(driver);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement db=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(db).build().perform();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.close();
	}

}
