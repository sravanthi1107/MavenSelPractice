package pom.model;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindElementsPom {

	
		@FindBy(xpath="//a")
		private List<WebElement> Listnm;
		
		public void countLinks()
		{
			int count=Listnm.size();
			System.out.println(count);
		}
		

	}


