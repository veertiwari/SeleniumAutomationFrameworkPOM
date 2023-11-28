package basepackage;

import org.openqa.selenium.WebDriver;



public class DriverFactory {

	//Private constructor. , trying to aching factory design pattern to achieve the singleton design.	
	private DriverFactory() {


	}

	private static DriverFactory instance=new DriverFactory();
// Creating threadSafe driver to run the test in parallel mode
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
// Getting the driver instance from getter method
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
	public void closeDriverInstance() {
		driver.get().quit();

	}
}
