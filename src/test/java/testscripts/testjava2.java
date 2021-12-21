package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import basepackage.baseclass;

public class testjava2 extends baseclass {
 
	@Test
	public void testexecute2() {
		
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.getTitle();
		System.out.println("second test executed");
	}
}
