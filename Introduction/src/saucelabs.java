
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class saucelabs {
   @BeforeTest
	public void setup()
	{
	DesiredCapabilities	dc =  DesiredCapabilities.internetExplorer();
	dc.setCapability("version", "5");
	dc.setCapability("platform", "xp");
	WebDriver driver = new RemoteWebDriver()
	}
}
