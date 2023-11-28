package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import ExtentReporter.ExtentTestManager;
import basepackage.baseclass;

public class test extends baseclass {

	public static WebDriver driver;

	@Test(priority=3)
	public  void test1() {

		driver=InintializeDriver();
		System.out.println(Thread.currentThread().getName()+ " : where test are executing");
		System.out.println(Thread.currentThread().getName()+ " : where test are executing");
		driver.get("https://in.tradingview.com/");
		ExtentTestManager.getInstance().getExetent().log(Status.INFO, MarkupHelper.createLabel("test step 1", ExtentColor.BLUE));		
		ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart website opened successfully");
		driver.getTitle();
		ExtentTestManager.getInstance().getExetent().log(Status.INFO, driver.getTitle() );
		ExtentTestManager.getInstance().getExetent().log(Status.INFO, "flipkart tittle caputured successfully");
		Assert.assertTrue(true);
		ExtentTestManager.getInstance().getExetent().log(Status.INFO,"first test executed");
		System.out.println("first test executed");

	}



}


