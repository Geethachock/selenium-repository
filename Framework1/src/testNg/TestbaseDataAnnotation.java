package testNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestbaseDataAnnotation {
    WebDriver driver;
	
	@Test
	public void login() throws IOException
	{   Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Geetha\\workspace\\Framework1\\src\\testNg\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

		if(prop.getProperty("browser").contains("ChromeDriver"))
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
		driver.get(prop.getProperty("url"));
	}
	@Test(dataProvider="getdata")
	public void printmethod(String username,String password,String id)
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println(id);
	}
	@Test
	public void printmethod1()
	{
		System.out.println("print");
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][3];
		data[0][0]="abc";
		data[0][1]="fbc";
		data[0][2]="wbc";
		data[1][0]="abc";
		data[1][1]="fbc";
		data[1][2]="wbc";
		data[2][0]="abc";
		data[2][1]="fbc";
		data[2][2]="wbc";
		return data;
		
		
		
	}
}
