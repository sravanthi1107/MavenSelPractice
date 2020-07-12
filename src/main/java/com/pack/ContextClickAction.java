package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickAction {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Actions action=new Actions(driver);
		driver.get("https://www.facebook.com/");
		//action.sendKeys("https://www.facebook.com/"+Keys.ENTER).perform();;
		
		WebElement fg=driver.findElement(By.linkText("Forgotten account?"));
        action.contextClick(fg).perform();
        action.sendKeys("t").click().perform();

	}

}
