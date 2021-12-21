package testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import basepackage.baseclass;

public class testjava1 extends baseclass{
	
	@SuppressWarnings("deprecation")
	@Test
	public void testexecute1() throws IOException {
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.getTitle();
		Assert.assertTrue(false);
		System.out.println("first test executed");
	}
}
