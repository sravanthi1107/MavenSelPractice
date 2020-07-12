package com.pack;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrw3Ex {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String Mainwin=driver.getWindowHandle();
		System.out.println(Mainwin);
		Set<String> b=driver.getWindowHandles();
		int count=b.size();
		System.out.println(count);
		for(String c:b)
		{
			driver.switchTo().window(c);
			String Title=driver.getTitle();
			System.out.println(Title);
			if(Title.equals("Micron"))
			{
				driver.close();
			}
		}
		
		driver.switchTo().window(Mainwin);
		//driver.quit();
		
	}

}
