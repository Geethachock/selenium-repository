package listenerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerDemo.ListenerTest.class)	
public class TestCases 
{
	static WebDriver driver;
	
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	// Test to pass as to verify listeners .		
	@Test		
	public void Login()				
	{		
	    driver.get("https://www.facebook.com/");					
	    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
	    driver.findElement(By.name("password")).sendKeys("amUpenu");							
	    driver.findElement(By.name("btnLogin")).click();					
	}		

	// Forcefully failed this test as to verify listener.		
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	}		
}
