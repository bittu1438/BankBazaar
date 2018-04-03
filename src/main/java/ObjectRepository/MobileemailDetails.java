package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibraries.ExcelLib;

public class MobileemailDetails extends ExcelLib
{
	@FindBy(xpath="//input[@id='form_details_person_currentContactDetail_primaryMobile_contact']")
	WebElement mobilenum;
	
	@FindBy(xpath="//input[@id='form_details_person_currentContactDetail_primaryEmail_contact']")
	WebElement emailid;
	
	@FindBy(xpath="//button[@id='continueFormComboButtonCreditTracker']")
	WebElement continuebtn;
	
	public void mobileemaildetails() throws Throwable
	{
		mobilenum.sendKeys(ExcelLib.getExceldata("sheet1",1,4));
		emailid.sendKeys(ExcelLib.getExceldata("sheet1", 1, 5));
		continuebtn.click();
	}
}
