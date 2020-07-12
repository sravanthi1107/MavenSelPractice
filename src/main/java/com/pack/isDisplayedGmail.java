package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedGmail {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
 WebElement gm=driver.findElement(By.xpath("//input[@type='email']"));
 gm.click();
 gm.sendKeys("sravanthithota11@gmail.com");
 WebElement next=driver.findElement(By.xpath("//span[@class='CwaK9'][contains(.,'Next')]"));
 
 boolean be=next.isDisplayed();
 if(be)
 {
	 next.click();
	 System.out.println("next button is displayed");
 }
 else
	 System.out.println("next is not displayed");
 
}
}
