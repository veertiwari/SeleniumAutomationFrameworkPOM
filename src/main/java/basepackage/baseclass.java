package basepackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class baseclass  {
public static WebDriver  driver;
ThreadLocal<WebDriver> localdriver=new ThreadLocal<WebDriver>();
public static ExtentReports extent;
public static ExtentTest logger;
public ThreadLocal<ExtentTest> test=new ThreadLocal<ExtentTest>();
public ThreadLocal<ExtentReports> extentreport=new ThreadLocal<ExtentReports>();


public static ExtentReports extentReportGenerator() {
	String reportPath=System.getProperty("user.dir")+"\\ExtentReport\\extentreport.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(reportPath);
	reporter.config().setReportName("Automation Report");
	reporter.config().setDocumentTitle("test Result");
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Veer Tiwari");
	return extent;
	
}

@BeforeSuite
public WebDriver initializeDriver() {
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resource\\chromedriver.exe");
driver =new ChromeDriver();
localdriver.set(driver);
driver.manage().window().maximize();
return driver;

}
	

public String getscreenshot(WebDriver driver,String testcasename) throws IOException {
	TakesScreenshot scn=(TakesScreenshot)driver;
	File sourceFile=scn.getScreenshotAs(OutputType.FILE);
	String destPath=System.getProperty("user.dir")+"\\ExtentReport\\screenshots\\"+testcasename+System.currentTimeMillis()+".png";
	File destfile=new File(destPath);
    FileUtils.copyFile(sourceFile, destfile);
	return destPath;
} 

	public void tearDown(WebDriver driver) {
		
		driver.close();
		
	}
	
	/*
	 * public void setContext(ITestContext iTestContext, WebDriver Driver) {
	 * 
	 * iTestContext.setAttribute("WebDriver", this.driver);
	 * 
	 * }
	 */

}
