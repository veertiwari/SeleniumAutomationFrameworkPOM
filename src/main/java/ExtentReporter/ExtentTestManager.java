package ExtentReporter;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ExtentTestManager {
	// Setting extentInstance thread safe for mutli threading environment.
	private static ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();

	private ExtentTestManager() {


	}
	private static ExtentTestManager instance=new ExtentTestManager();

	public static ExtentTestManager getInstance() {

		return instance;
	}



	public  ExtentTest getExetent() {
		return extentTest.get();
	}
	public void setExtent(ExtentTest extentTestObj) {
		extentTest.set(extentTestObj);
}

	public void removeExtent() {
		extentTest.remove();
}

	public void log(Status pass, String string) {
		// TODO Auto-generated method stub

	}
	public static void log(Status pass, String s, MarkupHelper helper) {
		// TODO Auto-generated method stub

	}
	public static void log(Status info, String s, Markup createLabel) {
		// TODO Auto-generated method stub

	}


}

