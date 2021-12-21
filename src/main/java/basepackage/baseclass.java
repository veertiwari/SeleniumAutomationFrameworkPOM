package basepackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass  {
	

BrowserFactory bf=new BrowserFactory();

@BeforeMethod
public void initializeDriver() {
DriverFactory.getInstance().setDriver(bf.createbrowserInstance("chrome"));
DriverFactory.getInstance().getDriver().manage().window().maximize();

DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);


}
	

public static String getscreenshot(WebDriver driver,String testcasename) throws IOException {
	TakesScreenshot scn=(TakesScreenshot)driver;
	File sourceFile=scn.getScreenshotAs(OutputType.FILE);
	String destPath=System.getProperty("user.dir")+"\\ExtentReport\\screenshots\\"+testcasename+System.currentTimeMillis()+".png";
	File destfile=new File(destPath);
    FileUtils.copyFile(sourceFile, destfile);
	return destPath;
} 
@AfterMethod
public void tearDown() {
	DriverFactory.getInstance().closeBrowser();
}
	
	
}
