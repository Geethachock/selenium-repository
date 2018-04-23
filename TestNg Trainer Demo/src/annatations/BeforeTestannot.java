package annatations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//using @beforeTest, can be used for multiple classes
public class BeforeTestannot  {
	public WebDriver driver;
  @BeforeTest
  public void nav()
	{
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.americanexpress.com/");
	}

}
