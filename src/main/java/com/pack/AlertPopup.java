package com.pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.findElement(By.xpath("//button[@class='btn btn-primary'][contains(.,'Ok')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(.,'Find trains')]")).click();
		try
		{
			Alert alert=driver.switchTo().alert();
			String text=alert.getText();
			System.out.println(text);
			//alert.accept();
			alert.dismiss();
			
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("alert popup is displayed");
			
		}

	}

}
