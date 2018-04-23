

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
	import org.openqa.selenium.Alert;

	public class alertDemo{
	     @Test
		public void handleAlert()
		{
	    	 System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
	 		WebDriver driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	         driver.get("http://www.ksrtc.in/oprs-web/");
	         driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
	         Alert alt=driver.switchTo().alert();
	         String alttext = alt.getText();
	         System.out.println("The text is "+ alttext);
	         alt.accept();
	        Assert.assertEquals(alttext,"Please select start place.");
	        
	         
		}
	}

