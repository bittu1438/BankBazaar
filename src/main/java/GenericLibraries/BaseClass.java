package GenericLibraries;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class BaseClass extends ExcelLib
{
	public ExtentReports extent;
	public ExcelLib elib;
	public static WebDriver driver;
	@BeforeSuite
	public void extentreport()
	{
		 extent = new ExtentReports("./test-output/report.html", true);
		extent.loadConfig(new File("./extent-config.xml"));
	}
	@BeforeMethod
	public void openbrowser() throws Throwable
	{
//		FirefoxDriverManager.getInstance().setup();
//		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(ExcelLib.getExceldata("sheet1", 1, 0));
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	@AfterSuite
	public void extentreportclose()
	{
		extent.flush();
		extent.close();
	}
}
