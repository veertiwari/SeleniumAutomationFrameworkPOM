package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import basepackage.DriverFactory;
import basepackage.ExtentFactory;
import basepackage.baseclass;

public class testjava2 extends baseclass {

	@Test
	public void testexecute2() {
		DriverFactory.getInstance().getDriver().get("https://www.flipkart.com/");
		ExtentFactory.getInstance().getExtentTest().log(Status.INFO, "flipkart test 2 opened successfully");
		DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		DriverFactory.getInstance().getDriver().getTitle();
		ExtentFactory.getInstance().getExtentTest().log(Status.INFO, "flipkart test 2 Title captured");
		System.out.println("second test executed");
	}
}
