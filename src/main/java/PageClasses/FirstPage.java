package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage 
{
	@FindBy(xpath="//div[@class='tab-sec hungry-more']")
	WebElement clickbtn;
	
	@FindBy(xpath="//a[@title='How to Improve Credit Score']")
	WebElement improvecreditscore;
	
	@FindBy(xpath="//div[@id='primary-content-section']/div[1]/div[1]/div[1]/p/a")
	WebElement creditScore;
	
	public void hungryformore()
	{
		clickbtn.click();
	}
	
	public void improvecredit() {
		improvecreditscore.click();
	}
	
	public void checkcredit() {
		creditScore.click();
	}
}
