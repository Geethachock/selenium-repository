package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class  seleniumgridamazon {

	public WebDriver driver;
	public static String url;
	public static String Node;
	
	@BeforeTest
	public void openapp() throws MalformedURLException
	{
	    url ="https://www.google.com/";
		Node ="http://localhost:5555/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL(Node),cap);
		driver.manage().window().maximize();
		driver.get(url);
	}
	@Test
	public void getTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
		

	

}
