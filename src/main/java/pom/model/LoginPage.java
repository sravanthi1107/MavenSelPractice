package pom.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		@FindBy(id="username")
		private WebElement username;
		@FindBy(name="pwd")
		private WebElement pwd;
		@FindBy(id="loginButton")
		private WebElement login;
		
		public LoginPage(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
				
		}
	public void SetUsername(String un)
	{
		username.sendKeys(un);
	}
public void SetPassword(String pw)
{
	pwd.sendKeys(pw);
}
	
	public void ClickLogin()
	{
		login.click();
	}
	
}
