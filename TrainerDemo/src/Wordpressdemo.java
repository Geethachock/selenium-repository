import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*Launch the WordPress site
Open the Admin Login page
Enter valid login data
Navigate to the Write Post page
Write the post
Publish the post
Verify that it was actually post*/

public class Wordpressdemo {
  WebDriver driver;
	@Test
	public void Launchpage()
	{
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		driver = new ChromeDriver(chromeOptions);
	    driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	}
	@Test
	public void Login()
	{
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		driver.findElement(By.id("wp-submit")).click();
	}
	@Test
	public void Title()
	{
		String a = driver.getTitle();
		Assert.assertEquals(a, "Howdy, admin", "Title not present");
	}
	
	
	
	
}
