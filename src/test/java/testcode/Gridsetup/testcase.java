package testcode.Gridsetup;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testcase {
	
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver;
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("Chrome");
		dc.setPlatform(Platform.MAC);
		
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.merge(dc);
		
		driver = new RemoteWebDriver(new URL("http://192.168.43.70:4444/wd/hub"), dc);
		
		driver.get("https://www.google.com");
		
//		String nodeUrl = "http://192.168.43.70:4444/wd/hub";
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setPlatform(Platform.MAC);
//		ChromeOptions options = new ChromeOptions();
//		options.merge(capabilities);
//		driver = new RemoteWebDriver(new URL("http://192.168.43.70:4444/wd/hub"), options);
//		driver.get("http://www.amazon.com");
//		  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//	      capabilities.setCapability(capabilityName, value);
//	    
//	     driver = new RemoteWebDriver(new URL("http://192.168.0.106:5566/wd/hub"), capabilities);
//	     
//	     
//	      
//	       driver.get("http://google.com");
//	       System.out.println(driver.getTitle());

		
	}

}
