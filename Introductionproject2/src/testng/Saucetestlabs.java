package testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saucetestlabs {
	@Test
public void setup() throws MalformedURLException
{
	DesiredCapabilities dc = DesiredCapabilities.firefox();
	dc.setCapability("Platform", "XP");
	dc.setCapability("Version", "5");
	
	WebDriver driver = new RemoteWebDriver(new URL("http://geethachock:409b181b-a68c-4d1d-af69-112a5d8a2b2b@ondemand.saucelabs.com:80/wd/hub"),dc);
	driver.get("http://ebay.com");
	System.out.println(driver.getTitle());

}
}
