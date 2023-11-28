package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import ExtentReporter.ExtentTestManager;
import basepackage.DriverFactory;
import basepackage.baseclass;

public class testjava2 extends baseclass {
	
	public static WebDriver driver;
	@Test(priority=1)
	public void testexecute2() throws InterruptedException {
		driver=InintializeDriver();
		System.out.println(Thread.currentThread().getName()+ " : where test are executing");
		System.out.println(Thread.currentThread().getId()+ " : where test are executing");
		driver.get("https://in.tradingview.com/");
         ExtentTestManager.getInstance().getExetent().log(Status.INFO, MarkupHelper.createLabel("test step 1", ExtentColor.BLUE));		
         ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart2 website opened successfully");
		  driver.getTitle();
		  ExtentTestManager.getInstance().getExetent().log(Status.INFO, driver.getTitle() );
		ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart2 tittle caputured successfully");
		Assert.assertTrue(true);
		ExtentTestManager.getInstance().getExetent().log(Status.INFO,"first3 test executed");
	    System.out.println("third test executed");
		

	}
}
