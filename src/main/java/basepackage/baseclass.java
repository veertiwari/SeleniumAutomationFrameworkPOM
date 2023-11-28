package basepackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import ExtentReporter.ExtentReportManager;
import ExtentReporter.ExtentTestManager;

public class baseclass {
BrowserFactory bf=new BrowserFactory();
public ExtentTest test;
public static  ExtentReports  report;

@BeforeSuite
public  void setupReport(){
	report=	ExtentReportManager.generateReport();
	
}
@BeforeMethod
public void  testSetup(ITestResult result) {
test=report.createTest(result.getMethod().getMethodName());
ExtentTestManager.getInstance().setExtent(test);

}

public WebDriver InintializeDriver() {
DriverFactory.getInstance().setDriver(bf.createbrowserInstance("chrome"));
WebDriver driver =DriverFactory.getInstance().getDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
return driver;



}
	
public static String getscreenshot(WebDriver driver,String testcasename) throws IOException {
	TakesScreenshot scn=(TakesScreenshot)driver;
	File sourceFile=scn.getScreenshotAs(OutputType.FILE);
	String destPath=System.getProperty("user.dir")+"\\ExtentReport\\screenshots\\"+testcasename+System.currentTimeMillis()+".png";
	File destfile=new File(destPath);
    FileUtils.copyFile(sourceFile, destfile);
	return destPath;
} 
@SuppressWarnings("static-access")

@AfterMethod
public void reportStatus(ITestResult result) {
	if(result.isSuccess()) {
		ExtentTestManager.getInstance().log(Status.PASS, result.getMethod().getMethodName());
		
	}
	if(!result.isSuccess()) {
		ExtentTestManager.getInstance().getExetent().log(Status.FAIL, MarkupHelper.createLabel(result.getMethod().getMethodName(), ExtentColor.RED));	
		
	}
		
	report.flush();
	DriverFactory.getInstance().closeDriverInstance();
	
	
}


@AfterSuite
public void reportFlush() {
//	report.flush();
//	DriverFactory.getInstance().closeBrowser();
	
	
}
	


	
}
