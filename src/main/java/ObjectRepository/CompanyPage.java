package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibraries.ExcelLib;

public class CompanyPage extends ExcelLib
{
	
	@FindBy(xpath="//div[@class='eform-input-group eform-no-group']/span[@class='twitter-typeahead']/input[2]")
	WebElement companyname;
	
	@FindBy(xpath="//div[@class='container eform-section js-container-eform-section eform-company-bg']/div[@class='eform-btn clearfix']/button")
	WebElement continuebtn;
	
	public void companyname() throws Throwable 
	{
		companyname.sendKeys(ExcelLib.getExceldata("sheet1", 1, 1));
		continuebtn.click();
	}

}
