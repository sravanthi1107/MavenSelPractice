package com.pack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksBrokenValidcheck {
	
	public static WebDriver driver;
	
	public static void main(String[] args)
	{
	String homePage="http://www.zlti.com";
	String url="";
	HttpURLConnection huc=null;
	int respcode=200;
	
	System.setProperty("webdriver.gecko.driver", "C:\\SRAVANTHI-PERSONAL\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	
	List<WebElement> allLink=driver.findElements(By.tagName("a"));
	
	Iterator<WebElement> l1=allLink.iterator();
	
	while(l1.hasNext())
	{
		url=l1.next().getAttribute("href");
		System.out.println(url);
		
		if(url==null||url.isEmpty())
		{
			System.out.println("URL is not configured for anchor tag or it is empty");
			continue;
		}
		if(!url.startsWith(homePage))
		{
			System.out.println("URL belongs to other domain ,skipping it");
			continue;
		}
		try {
			
			huc=(HttpURLConnection)(new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			respcode=huc.getResponseCode();
			
			if(respcode>=400)
			{
				System.out.println(url+"is a broken link");
			}
			else
				System.out.println(url+"is a valid link");
			
		}	
		
	catch(MalformedURLException e)
		{
		e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}	
	}
	
	driver.quit();
	
}
}
