package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavScriptExce {
	public static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
//		driver.get("http://localhost/login.do");
//		RemoteWebDriver r= (RemoteWebDriver) driver;
//r.executeScript("alert('Hi')");
driver.get("https://www.gmail.com");
JavascriptExecutor js=(JavascriptExecutor)driver;

//refresh page
//js.executeScript("history.go(0)");

js.executeScript("document.getElementById('identifierId').value='sravanthithota11@gmail.com';");
js.executeScript("document.getElementById('identifierNext').click();");
driver.findElement(By.xpath("//input[contains(@type,'password')])")).sendKeys("Havisha@119");
WebElement login = driver.findElement(By.id("passwordNext"));
js.executeScript("arguments[0].click();",login);



	}
	

}
