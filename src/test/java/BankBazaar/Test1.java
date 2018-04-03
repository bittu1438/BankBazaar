package BankBazaar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class Test1 
{
	@Test(enabled=false)
	public void creditscoreTest() throws Throwable 
	{	FirefoxDriverManager.getInstance().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.BankBazaar.com/credit-report.html");
		driver.manage().window().maximize();
		//gender selection(page=1)
		driver.findElement(By.xpath("//span[@class='sprite-gender icon-gender-male']")).click();
		Thread.sleep(1000);
		//advertisement close button(page=2)
		driver.findElement(By.xpath("//a[@class='close-btn']")).click();
		//element to drag(page=2)
		WebElement drag=driver.findElement(By.xpath("//div[@class='news-tagger-content']/div[1]/div[1]/div[1]/div[1]/div[2]"));
		
		Actions act=new Actions(driver);
		//using actions class to drag for selecting year(page=2)
		act.clickAndHold(drag).moveByOffset(62, 0).release().build().perform();	
		//xpath for selecting month(page=2);
		driver.findElement(By.xpath("//a[text()='Feb 1992']")).click();
		//xpath for selecting date in selected month(page=2)
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[6]")).click();
		//click on continue button(page=2)
		driver.findElement(By.xpath("//div[@class='carousel-inner js-el-carousel-inner city-dd bank-dd']/div[2]/div[1]/div[2]/button")).click();
		//selecting city location(page=3)
		driver.findElement(By.xpath("//span[@class='sprite-city icon-city-bangalore']")).click();
		//writing company name in selected city(page=4)
		driver.findElement(By.xpath("//div[@class='eform-input-group eform-no-group']/span[@class='twitter-typeahead']/input[2]")).sendKeys("TEST YANTRA SOFTWARE SOLUTIONS (INDIA) PVT LTD");
		//click on continue button(page=4)
		driver.findElement(By.xpath("//div[@class='container eform-section js-container-eform-section eform-company-bg']/div[@class='eform-btn clearfix']/button")).click();
		//storing element for dragging for selecting package(page=5)
		WebElement drag1=driver.findElement(By.xpath("//div[@class='item active']/div[@class='container eform-section js-container-eform-section ']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]"));
		//dragging the element using actions class(page=5)
		act.clickAndHold(drag1).moveByOffset(300, 0).release().build().perform();
		//click on continue button(page=5)
		driver.findElement(By.xpath("//div[@class='item active']/div[1]/div[2]/button")).click();
		//entering the First Name(page=6)
		driver.findElement(By.xpath("//input[@id='form_details_person_firstName']")).sendKeys("prasanna");
		//Entering the LAst Name(page=6)
		driver.findElement(By.xpath("//input[@id='form_details_person_lastName']")).sendKeys("kumar");
		//click on continue button(page=6)
		driver.findElement(By.xpath("//div[@class='container eform-section js-container-eform-section eform-personal-details-bg']/div[2]/button")).click();
		//writing the mobile number(page=7)
		driver.findElement(By.xpath("//input[@id='form_details_person_currentContactDetail_primaryMobile_contact']")).sendKeys("9642493320");
		//writing the mail address(page=7)
		driver.findElement(By.xpath("//input[@id='form_details_person_currentContactDetail_primaryEmail_contact']")).sendKeys("bittu.prasanna@gmail.com");
		//click on continue button(page=7)
		driver.findElement(By.xpath("//button[@id='continueFormComboButtonCreditTracker']")).click();
	}
}
