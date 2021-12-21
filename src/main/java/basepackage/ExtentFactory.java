package basepackage;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class ExtentFactory {
	
private static ExtentFactory instance=new ExtentFactory();
	
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
	private ExtentFactory() {
		
		
	}
	
	public static ExtentFactory getInstance() {
		
		return instance;
		
	}

	public ExtentTest getExtentTest()
	{
		return extenttest.get();
		
	}
	
	public void setExtentTest(ExtentTest extenttestparam) {
		extenttest.set(extenttestparam);
		
		
	}
	
public void removeExent() {
		extenttest.remove();
		
	}
	


}
