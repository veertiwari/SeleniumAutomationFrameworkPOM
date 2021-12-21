package ExtentReporter;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import basepackage.DriverFactory;
import basepackage.ExtentFactory;
import basepackage.ExtentReportManager;
import basepackage.baseclass;

public class ListenerClassTest implements ITestListener{

	static ExtentReports extentReport;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extentReport.createTest(result.getMethod().getMethodName());
		ExtentFactory.getInstance().setExtentTest(test);
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		ExtentFactory.getInstance().getExtentTest().log(Status.PASS, "test got passed");
		// TODO Auto-generated method stub
		ExtentFactory.getInstance().removeExent();
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			ExtentFactory.getInstance().getExtentTest().addScreenCaptureFromPath(baseclass.getscreenshot(DriverFactory.getInstance().getDriver(), result.getMethod().getMethodName()));
			ExtentFactory.getInstance().getExtentTest().log(Status.FAIL, result.getThrowable());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ExtentFactory.getInstance().removeExent();
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentFactory.getInstance().removeExent();	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		 extentReport=ExtentReportManager.extentReportGenerator();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extentReport.flush();
		//DriverFactory.getInstance().closeBrowser();
	}
	
	

}
