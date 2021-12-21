package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	//creating webdriver instance againts the browser
public WebDriver createbrowserInstance(String browserName) {
	WebDriver driver=null;
	
	
	if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resource\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver =new ChromeDriver(options);
		
	}
	else if (browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
		
	else if(browserName.equalsIgnoreCase("InternetExploer")) {
	
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
}
	return driver;

}
}
