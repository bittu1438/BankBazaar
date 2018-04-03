package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import GenericLibraries.BaseClass;

public class DraggingSalary extends BaseClass
{
	@FindBy(xpath="//div[@class='item active']/div[@class='container eform-section js-container-eform-section ']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]")
	WebElement draggingbtn;
	
	@FindBy(xpath="//div[@class='item active']/div[1]/div[2]/button")
	WebElement continuebtn;
	
	public void draggingbtn()
	{
		Actions act = new Actions(driver);
		act.clickAndHold(draggingbtn).moveByOffset(300, 0).release().build().perform();
		continuebtn.click();
	}
}
