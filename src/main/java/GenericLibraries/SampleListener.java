package GenericLibraries;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
	//"E:\\javabasics\\BankBazaar\\Screenshots"+failedmtdname+".png"	
	}

	@Override
	public void onTestFailure(ITestResult e) {
		
			EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.driver);
			String failedmtdname = e.getMethod().getMethodName();
			File srcfile = edriver.getScreenshotAs(OutputType.FILE);
			File dstfile = new File("./Screenshots/"+failedmtdname+".png");
			try {
				FileUtils.copyFile(srcfile, dstfile);
			}
			catch(Exception e1){
				e1.toString();
			}
			
		}
		
	

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName()+"test case started");
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the test case passed is: "+Result.getName());
	}

}
