package com.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebElement username;
	private WebElement password;
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		username=driver.findElement(By.id("username"));
		password=driver.findElement(By.name("pwd"));
		login=driver.findElement(By.id("loginButton"));
		}

	public void setUserName(String un)
	{
		username.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		password.sendKeys(pw);
	}
	public void ClickLogin()
	{
		login.click();
	}
	
	
}
