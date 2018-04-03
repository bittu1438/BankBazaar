package BankBazaar;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import PageClasses.FirstPage;

public class CreditTest2 extends BaseClass{
	
	@Test(priority=1)
	public void credittest2() throws Throwable 
	{
		FirstPage fp = PageFactory.initElements(driver, FirstPage.class);
		fp.checkcredit();
	}
}
