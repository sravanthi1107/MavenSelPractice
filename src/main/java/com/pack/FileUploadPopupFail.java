package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupFail {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.2shared.com/");
		WebElement upload=driver.findElement(By.id("upField"));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		String bws="document.getElementById('upField')[0].removeAttribute('disabled')";
		//js.executeScript('arguments[0].removeAttribute("disabled");', upload);
		js.executeScript(bws);
		upload.sendKeys("C:\\sel-bhanu-html\\select-sort.txt");
		
	}

}
