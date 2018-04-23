package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class ParllelBrowser{
	
	@Test
	public void getFirefox()
	{
                
        System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.SoftwareTestingMaterial.com");
		driver.close();
	}
	
	@Test
	public void getChorme(){
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
        System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
 		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://www.SoftwareTestingMaterial.com");
		driver.close();
	}
}
