package com.excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		
		LoginPage l=new LoginPage(driver);
		for(int i=0;i<=2;i++)
		{
			String un=GenericExcelHandle.getCellvalue("C:\\sel-bhanu-html\\ActiTime2.xlsx","Sheet1",i,0);
			String pw=GenericExcelHandle.getCellvalue("C:\\sel-bhanu-html\\ActiTime2.xlsx","Sheet1",i,1);
			l.setUserName(un);
			l.setPassword(pw);
			l.ClickLogin();
			Thread.sleep(3000);
			
		}
		
		driver.close();		

	}

}
