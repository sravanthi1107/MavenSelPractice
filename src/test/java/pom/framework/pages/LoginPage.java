package pom.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pom.framework.script.BaseTest;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement pwd;
	@FindBy(id="loginButton")
	private WebElement login;
	
	public void getUsername(String un)
	{
		username.sendKeys(un);
	}
	public void getPassword(String pw)
	{
		pwd.sendKeys(pw);
	}
	public void clickLogin()
	{
		login.click();
	}
	public void getTitle()
	{
      String a=driver.getTitle();
       String eTitle="";
       Assert.assertEquals(a, eTitle);
        }
}