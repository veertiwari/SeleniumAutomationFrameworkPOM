package basepackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass {


BrowserFactory bf=new BrowserFactory();
public static WebDriver driver=null;


public WebDriver initializeDriver() {
DriverFactory.getInstance().setDriver(bf.createbrowserInstance("chrome"));
 driver =DriverFactory.getInstance().getDriver();
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
@AfterMethod
public void tearDown() {
	DriverFactory.getInstance().closeBrowser();
}
	
	
}
