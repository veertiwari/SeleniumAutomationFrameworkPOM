package testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import basepackage.DriverFactory;
import basepackage.ExtentFactory;
import basepackage.baseclass;

public class testjava1 extends baseclass{
	
	@SuppressWarnings("deprecation")
	@Test
	public void testexecute1() throws IOException {
		
		DriverFactory.getInstance().getDriver().get("https://www.flipkart.com/");
		ExtentFactory.getInstance().getExtentTest().log(Status.INFO, "flipkart website opened successfully");
		DriverFactory.getInstance().getDriver().getTitle();
		ExtentFactory.getInstance().getExtentTest().log(Status.INFO, "flipkart tittle caputured successfully");
		Assert.assertTrue(false);
		ExtentFactory.getInstance().getExtentTest().log(Status.INFO,"first test executed");
	}
}
