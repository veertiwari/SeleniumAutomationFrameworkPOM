package ExtentReporter;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class ExtentReportManager{

	// Creating Spark Report 

	static ExtentReports extent;
	public static  ExtentReports generateReport() {
		ExtentSparkReporter reporter=new ExtentSparkReporter("target/sparkreport.html").viewConfigurer().viewOrder().as(new ViewName[]{ViewName.DASHBOARD,ViewName.CATEGORY,ViewName.TEST}).apply();
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

