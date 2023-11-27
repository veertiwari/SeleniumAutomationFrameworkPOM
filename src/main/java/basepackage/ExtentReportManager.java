package basepackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager{
	public static ExtentReports extent;
public static ExtentReports extentReportGenerator() {
	
		String reportPath=System.getProperty("user.dir")+"\\ExtentReport\\extentreport.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Test Result");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Veer Tiwari");
		extent.setSystemInfo("OS", "Window");
		extent.setSystemInfo("Browser","chrome");
		extent.setSystemInfo("Environment", "UAT");
		return extent;
}

}