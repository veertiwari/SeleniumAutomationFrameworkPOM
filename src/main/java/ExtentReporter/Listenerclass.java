package ExtentReporter;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

import basepackage.baseclass;

public class Listenerclass extends baseclass implements ITestListener {

 ExtentReports reports=extentReportGenerator();

	
	
	
	@Override
	public void onTestStart(ITestResult result) {
		logger=reports.createTest(result.getMethod().getMethodName());
		test.set(logger);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().log(Status.PASS, "test passed");
	driver=(WebDriver) result.getTestContext().getAttribute("WebDriver");
		
	}

	@Override
	public void  onTestFailure(ITestResult result) {
		WebDriver driverobj = null;
		driverobj=(WebDriver) result.getTestContext().getAttribute("WebDriver");
		try {
			 test.get().log(Status.FAIL, result.getThrowable());
			 test.get().addScreenCaptureFromPath(getscreenshot(driverobj, result.getMethod().getMethodName()),result.getMethod().getMethodName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driverobj.close();

		
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
		context.setAttribute("WebDriver", driver);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
		
		
	}
	
	

	
	

}
