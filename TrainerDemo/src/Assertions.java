import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
   WebDriver driver;
	@Test
	public boolean userlogin()
	{    
		
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		driver = new ChromeDriver(chromeOptions);
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("mail2geethz@yahoo.com");
	    driver.findElement(By.id("pass")).sendKeys("geetha@123");
	    driver.findElement(By.id("loginbutton")).click();
	    String t = driver.getTitle();
	    String h = "(1) Facebook";
	    System.out.println(t);
	    if (t.equals(h))
	    {
	    return true;
	    }
	    else
	    {
	    return false;
	    }
	   
	}
	@Test
	public void verfiy()
	{
		Assert.assertTrue(userlogin(), "It got failed");
		driver.close();
		
	}
	
	
}

