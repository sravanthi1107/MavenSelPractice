package com.pack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsDisabled {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('hi welcome to fb')");
		//innertext
	String stext=	js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(stext);
		//Title of Webpage
		String Title=js.executeScript("return document.title;").toString();
		System.out.println(Title);	
		//domain
		String domain=js.executeScript("return document.domain;").toString();
		System.out.println(domain);
		//URL of Webpage
		
		String url=js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		//navigate new page
		js.executeScript("window.location='https://www.softwaretestingmaterial.com\';");
		
		
		
		
		
		

	}

}
