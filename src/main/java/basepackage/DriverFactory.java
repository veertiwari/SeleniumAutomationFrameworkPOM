package basepackage;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	
private DriverFactory() {
	
		
	}

private static DriverFactory instance=new DriverFactory();
	
 ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	public static  DriverFactory getInstance() {
		
		return instance;
		
	}

	public WebDriver getDriver()
	{
		return driver.get();
		
	}
	
	public void setDriver(WebDriver driverparam) {
		driver.set(driverparam);
		
		
	}
	
	public void closeBrowser() {
		driver.get().close();
		driver.remove();
	}
}
