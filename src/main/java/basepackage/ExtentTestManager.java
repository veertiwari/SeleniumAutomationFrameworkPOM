package basepackage;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ExtentTestManager {
	
	private ExtentTestManager() {
		
		
	}
	private static ExtentTestManager instance=new ExtentTestManager();
	
	public static ExtentTestManager getInstance() {
		
		return instance;
		}
	
	static ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();
	
public ExtentTest getExetent() {
	return extentTest.get();
	
	
}
public static void setExtent(ExtentTest extentTestObj) {
	extentTest.set(extentTestObj);
	
}

public void removeExtent() {
	extentTest.remove();
	
}

public void log(Status pass, String string) {
	// TODO Auto-generated method stub
	
}
public void log(Status pass, String s, MarkupHelper helper) {
	// TODO Auto-generated method stub
	
}
public void log(Status info, String s, Markup createLabel) {
	// TODO Auto-generated method stub
	
}
		
		
	}

