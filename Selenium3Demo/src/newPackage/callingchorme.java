package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class callingchorme {
	@Test
	public void Testchrome()
	{
    TestSeleniumDemo Demo = new TestSeleniumDemo();
	System.setProperty("webdriver.chrome.driver", Demo.chrome());
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("http://demosite.center/wordpress/wp-login.php");
    driver.quit();
	}
	
}
