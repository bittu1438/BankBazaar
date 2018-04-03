package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import GenericLibraries.BaseClass;

public class AgeSelection extends BaseClass{

	@FindBy(xpath="//a[@class='close-btn']")
	WebElement closebtn;
	
	@FindBy(xpath="//div[@class='news-tagger-content']/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement dragbtn;
	
	@FindBy(xpath="//a[text()='Feb 1992']")
	WebElement monthbtn;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[6]")
	WebElement datebtn;
	
	@FindBy(xpath="//div[@class='carousel-inner js-el-carousel-inner city-dd bank-dd']/div[2]/div[1]/div[2]/button")
	WebElement continuebtn;
	
	public void closebtn()
	{
		closebtn.click();
	}
	public void dragbtn()
	{
		Actions act = new Actions(driver);
		act.clickAndHold(dragbtn).moveByOffset(62, 0).release().build().perform();
		monthbtn.click();
		datebtn.click();
		continuebtn.click();
	}
	
	

	
}
