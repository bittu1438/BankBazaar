package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibraries.BaseClass;

public class CitySelection extends BaseClass
{
	@FindBy(xpath="//span[@class='sprite-city icon-city-bangalore']")
	WebElement citybtn;
	
	public void citybtn() 
	{
		citybtn.click();
	}
}
