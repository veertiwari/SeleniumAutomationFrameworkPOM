package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	public static  WebDriver driver=null;
	
	//creating webdriver instance against the browser
	public WebDriver createbrowserInstance(String browserName) {
		if(driver==null) {

			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver =new ChromeDriver();

			}
			else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}

			else if(browserName.equalsIgnoreCase("msedge")) {

				WebDriverManager.edgedriver().setup();
				driver=new InternetExplorerDriver();
			}

		}
		return driver;
	}
}
