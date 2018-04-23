package crossbrowserandparlleltestsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertesting{
 public WebDriver driver;
 @Parameters("Browser")
	@BeforeClass
	public void OpenBrowser(String Browser)
	{
		if(Browser.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
			

		}
		else if(Browser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.addArguments("--start-maximized");
			System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe" );
			 driver = new ChromeDriver(chromeoptions);
			
		}
		else
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			 driver = new InternetExplorerDriver(capabilities);
			
		}
		driver.get("http://store.demoqa.com/");
	}
 	@Test
	public void Login()
	{   driver.get("http://store.demoqa.com/");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.xpath(".//*[@id='log']")).sendKeys("testuser_1");
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Test@123");
		driver.findElement(By.xpath(".//*[@id='login']")).click();
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
