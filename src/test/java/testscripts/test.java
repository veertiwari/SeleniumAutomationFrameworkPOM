package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import basepackage.ExtentTestManager;
import basepackage.baseclass;

public class test extends baseclass {
	
	public static WebDriver driver;
	@Test
	public void test1() {
		driver =initializeDriver();
		driver.get("https://www.flipkart.com/");
         ExtentTestManager.getInstance().getExetent().log(Status.INFO, MarkupHelper.createLabel("test step 1", ExtentColor.BLUE));		
         ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart website opened successfully");
		  driver.getTitle();
		  ExtentTestManager.getInstance().getExetent().log(Status.INFO, driver.getTitle() );
		ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart tittle caputured successfully");
		Assert.assertTrue(true);
		ExtentTestManager.getInstance().getExetent().log(Status.INFO,"first test executed");
	}

		
		
	}


