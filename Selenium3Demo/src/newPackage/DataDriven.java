package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	WebDriver driver;
    @Test(dataProvider="Wordpress")
	public  void Datadriven(String Username, String Password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		driver = new ChromeDriver();
 		driver.manage().window().maximize();
         driver.get("http://demosite.center/wordpress/wp-login.php");
         driver.findElement(By.id("user_login")).sendKeys(Username);
         driver.findElement(By.id("user_pass")).sendKeys(Password);
         driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
         Thread.sleep(5000);
         System.out.println(driver.getTitle());
         Assert.assertTrue(driver.getTitle().contains("Dashboard"));
         driver.quit();
         
	}
    @DataProvider(name="Wordpress")
    public Object[][]Datapassing()
    {
    	Object[][] data = new Object[3][2];
    	data[0][0]="admin";
    	data[0][1]="demo";
    	
    	data[1][0]="admin";
    	data[1][1]="demo";
    	
    	data[2][0]="admin";
    	data[2][1]="demo123";
    	
    	return data;
   	
    }
    @AfterMethod
    public void close()
    {
    	driver.quit();
    }
}
