package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDuplicate {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("C:\\sel-bhanu-html\\select-fb.html");
		 Select drpdwn=new Select(driver.findElement(By.id("mtr")));
		List<WebElement> opt =drpdwn.getOptions();
		int found=0;
		for(WebElement allopt:opt)
		{
			String text=allopt.getText();
			System.out.println(text);
//			if(text.equals("Puri"))
//			{
//				found++;
//			}
			if(found>0)
			{
				System.out.println("no duplicate");
			}
			}
		System.out.println(found);
	}

}
