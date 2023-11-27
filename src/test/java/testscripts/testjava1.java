package testscripts;

import java.io.IOException;

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

public class testjava1 extends baseclass{
	public static ExtentTest logger;
	public static WebDriver driver;

	
	@Test
	public void testexecute1() throws IOException {
		driver =initializeDriver();
		driver.get("https://www.flipkart.com/");
         ExtentTestManager.getInstance().getExetent().log(Status.INFO, MarkupHelper.createLabel("test step 2", ExtentColor.BLUE));		
         ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart website opened successfully");
		  driver.getTitle();
		  ExtentTestManager.getInstance().getExetent().log(Status.INFO, driver.getTitle() );
		ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart tittle1 caputured successfully");
		Assert.assertTrue(true);
		ExtentTestManager.getInstance().getExetent().log(Status.INFO,"second test executed");
	}
}
