package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBisSelected {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement radio=driver.findElement(By.xpath("//input[@type='radio'][contains(@id,'6')]"));
		radio.click();
		
		boolean rd=radio.isSelected();
		if(rd)
		{
			System.out.println("radio button is selected");
			
		}else
			System.out.println("radio button is not selected");
		}
	}


