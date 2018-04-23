package Mavenproject.Acadamey;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	
	public WebDriver driver;
	String urlname;
	
	public WebDriver intializedriver() throws IOException
	{
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Geetha\\workspace\\Acadamey\\src\\main\\java\\Mavenproject\\Acadamey\\browser");
	prop.load(fis);
	String Browsername = prop.getProperty("browser");
	 urlname = prop.getProperty("url");
	if(Browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		driver = new ChromeDriver();
 		
	}
	else
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		 driver = new InternetExplorerDriver(capabilities);
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	//It's a method to take screenshot of failure test cases
	public void getscreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
	}
	
}
