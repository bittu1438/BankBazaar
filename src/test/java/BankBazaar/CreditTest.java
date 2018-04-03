package BankBazaar;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import ObjectRepository.AgeSelection;
import ObjectRepository.CitySelection;
import ObjectRepository.CompanyPage;
import ObjectRepository.DraggingSalary;
import ObjectRepository.GenderSelection;
import ObjectRepository.MobileemailDetails;
import ObjectRepository.NameDetails;

@Listeners(GenericLibraries.SampleListener.class)
public class CreditTest extends BaseClass
{
	
	@Test(priority=1)
	public void testscript() throws Throwable 
	{
		
		//ExtentTest logger=extent.startTest("Select a gender");
		GenderSelection gs =PageFactory.initElements(BaseClass.driver, GenderSelection.class);
		gs.malelink();
		//logger.log(LogStatus.INFO, "select age");
		AgeSelection as=PageFactory.initElements(BaseClass.driver, AgeSelection.class);
		as.closebtn();
		as.dragbtn();
		//logger.log(LogStatus.INFO, "select a city");
		CitySelection cs =PageFactory.initElements(BaseClass.driver, CitySelection.class);
		cs.citybtn();
		
		//extent.endTest(logger);
		CompanyPage cp = PageFactory.initElements(BaseClass.driver, CompanyPage.class);
		cp.companyname();
		DraggingSalary ds=PageFactory.initElements(BaseClass.driver, DraggingSalary.class);
		ds.draggingbtn();
		NameDetails nd=PageFactory.initElements(BaseClass.driver, NameDetails.class);
		nd.firstlastname();
		Assert.assertTrue(false);
		MobileemailDetails md=(MobileemailDetails) PageFactory.initElements(BaseClass.driver, MobileemailDetails.class);
		md.mobileemaildetails();
		
		
	}
}
