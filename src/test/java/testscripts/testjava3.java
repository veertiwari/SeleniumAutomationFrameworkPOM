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

public class testjava3 extends baseclass {
	public static WebDriver driver;
	@Test
	public void testexecute3() {
		
		DriverFactory.getInstance().getDriver().get("https://www.flipkart.com/");
		ExtentFactory.getInstance().getExtentTest().log(Status.INFO, "flipkart 3 opened successfully");
		DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		DriverFactory.getInstance().getDriver().getTitle();
		ExtentFactory.getInstance().getExtentTest().log(Status.INFO, "flipkart tittle 3 captured");
		System.out.println("third test executed");
		
	}
}
