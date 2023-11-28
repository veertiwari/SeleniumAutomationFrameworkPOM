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
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class testjava3 extends baseclass {
	
	public static WebDriver driver;
	
	
	@Test(priority=2)
	public void testexecute3() throws InterruptedException {
		driver=InintializeDriver();
		System.out.println(Thread.currentThread().getName()+ " : where test are executing");
		System.out.println(Thread.currentThread().getId()+ " : where test are executing");
		driver.get("https://in.tradingview.com/");
         ExtentTestManager.getInstance().getExetent().log(Status.INFO, MarkupHelper.createLabel("test step 1", ExtentColor.BLUE));		
         ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart3 website opened successfully");
		 driver.getTitle();
		 ExtentTestManager.getInstance().getExetent().log(Status.INFO, driver.getTitle() );
		ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart3 tittle caputured successfully");
		Assert.assertTrue(false);
		ExtentTestManager.getInstance().getExetent().log(Status.INFO,"first4 test executed");
	    System.out.println("foruth test executed");
		
	}
}
