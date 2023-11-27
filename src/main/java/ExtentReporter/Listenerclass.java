package ExtentReporter;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;

import basepackage.DriverFactory;
import basepackage.ExtentReportManager;
import basepackage.ExtentTestManager;
import basepackage.baseclass;


public class Listenerclass extends baseclass implements ITestListener {
	static ExtentReports report;
	ExtentTest test;
	@SuppressWarnings("static-access")
	@Override
	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getMethod().getMethodName());
		ExtentTestManager.getInstance().setExtent(test);
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentTestManager.getInstance().getExetent().log(Status.PASS,MarkupHelper.createLabel("test passed", ExtentColor.GREEN));
		
	}

	@Override
	public void  onTestFailure(ITestResult result) {
		
		ExtentTestManager.getInstance().getExetent().log(Status.FAIL, MarkupHelper.createLabel("Test Step Failed", ExtentColor.RED));
		
			try {
				ExtentTestManager.getInstance().getExetent().addScreenCaptureFromPath(getscreenshot(driver, result.getMethod().getMethodName()),"" );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			
		tearDown();

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		report=ExtentReportManager.extentReportGenerator();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	report.flush();
	ExtentTestManager.getInstance().removeExtent();
		
		
		
	}
	
	

	
	

}
