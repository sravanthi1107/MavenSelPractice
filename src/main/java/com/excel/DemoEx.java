package com.excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoEx {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
				String un=GenericExcelHandle.getCellvalue("C:\\sel-bhanu-html\\ActiTime1.xlsx","Sheet1",1,0);
				String pw=GenericExcelHandle.getCellvalue("C:\\sel-bhanu-html\\ActiTime1.xlsx","Sheet1",1,1);
				driver = new ChromeDriver();
				driver.get("http://localhost/login.do");
				driver.manage().window().maximize();
				LoginPage l=new LoginPage(driver);
				l.setUserName(un);
				l.setPassword(pw);
				l.ClickLogin();
	}

}
