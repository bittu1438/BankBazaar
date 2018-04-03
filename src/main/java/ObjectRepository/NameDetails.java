package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibraries.ExcelLib;

public class NameDetails extends ExcelLib
{	
	@FindBy(xpath="//input[@id='form_details_person_firstName']")
	WebElement firstname;
		
	@FindBy(xpath="//input[@id='form_details_person_lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//div[@class='container eform-section js-container-eform-section eform-personal-details-bg']/div[2]/button")
	WebElement continuebtn;
	
	public void firstlastname() throws Throwable 
	{
		firstname.sendKeys(ExcelLib.getExceldata("sheet1", 1, 2));
		lastname.sendKeys(ExcelLib.getExceldata("sheet1", 1, 3));
		continuebtn.click();
	}
}
