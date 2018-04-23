import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        
        driver.findElement(By.xpath(".//*[@id='post-body-7708391096228750161']/button")).click();
       //implicit wait take out the comment in next step and use implicit
         // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='demo']")));
          Boolean element = status.isDisplayed();
          if(element)
          {
        	  System.out.println("is displayed");
          }
          else
          {
        	  System.out.println("is not displayed");
          }

		
	}

}
