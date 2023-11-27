package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import basepackage.DriverFactory;
import basepackage.ExtentTestManager;
import basepackage.baseclass;

public class testjava3 extends baseclass {
	public static ExtentTest logger;
	public static WebDriver driver;
	@Test
	public void testexecute3() throws InterruptedException {
		
		driver =initializeDriver();
		driver.get("https://www.flipkart.com/");
         ExtentTestManager.getInstance().getExetent().log(Status.INFO, MarkupHelper.createLabel("test step 1", ExtentColor.BLUE));		
         ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart3 website opened successfully");
		  driver.getTitle();
		  ExtentTestManager.getInstance().getExetent().log(Status.INFO, driver.getTitle() );
		ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart3 tittle caputured successfully");
		Assert.assertTrue(true);
		ExtentTestManager.getInstance().getExetent().log(Status.INFO,"first4 test executed");
	
//		ExtentTestManager.getIntance().getExetent().log(Status.INFO, "flipkart test 2 Title captured");
		System.out.println("foruth test executed");
	}
}
