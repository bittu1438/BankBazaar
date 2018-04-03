package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibraries.BaseClass;

public class GenderSelection extends BaseClass {
	
		@FindBy(xpath="//span[@class='sprite-gender icon-gender-male']")
		WebElement malelink1;
		
		public void malelink()
		{
			
			malelink1.click();
		}
}
