package com.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEbay {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.ebay.com/");
		
		WebElement Allcat=driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select dropdown=new Select(Allcat);
		List<WebElement> allitems=dropdown.getOptions();
		System.out.println(allitems);
		List<String> OriginalList=new ArrayList();
		for(WebElement s:allitems)
		{
			//System.out.println(s);
			String str=s.getText();
			
			
			System.out.println(s.getText());	
			OriginalList.add(s.getText());
			
		}
		Set<String> ts=new TreeSet(OriginalList);
		System.out.println("before sorting"+OriginalList);
		System.out.println("after sorting"+ts);
		
				

	}

}
