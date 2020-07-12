package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSScrollMenu {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://news.google.com/");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement xp=driver.findElement(By.xpath("//span[contains(text(),'Entertainment')]"));
		
		int y=xp.getLocation().getY();
		String jscode="window.scrollBy(0,"+y+")";
		js.executeScript(jscode);
		
	}

}
