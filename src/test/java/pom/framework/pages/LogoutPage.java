package pom.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pom.framework.script.BaseTest;

public class LogoutPage extends BasePage{

	public  LogoutPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[contains(@class,'popup_menu_arrow')])[3]")
   private WebElement help;
	
	@FindBy(linkText="About actiTIME")
	private WebElement aboutAct;
	
	@FindBy(xpath="//span[@class='productVersion']")
	private WebElement product;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement close;
	
	//logoutLink
	@FindBy(linkText="Logout")
	private WebElement logout;
	
	
	public void aboutAct()
	{
		aboutAct.click();
	String	a=driver.getTitle();
	System.out.println(a);
	String e="actiTIME - Enter Time-Track";
	Assert.assertEquals(a, e);
	}
	public void Product()
	{
		product.click();
	String	pr=driver.getTitle();
	System.out.println(pr);
	String actpr="actiTIME - Enter Time-Track";
	Assert.assertEquals(pr, actpr);
		
	}
	
	public void help()
	{
		help.click();
	}
	public void Close()
	{
		close.click();
	}
	
public void Logout()
{
	logout.click();
}
	
}

