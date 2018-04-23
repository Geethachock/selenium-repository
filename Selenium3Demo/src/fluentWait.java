import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class fluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        
        driver.findElement(By.xpath(".//*[@id='post-body-7708391096228750161']/button")).click();
        Wait wait = new FluentWait<WebDriver>(driver)    
        	    .withTimeout(30, TimeUnit.SECONDS)    
        	    .pollingEvery(5, TimeUnit.SECONDS)   
        	    .ignoring(NoSuchElementException.class);

        	WebElement foo = wait.until(new Function<WebDriver, WebElement>() {    
        	    public WebElement apply(WebDriver driver) {    
        	        return driver.findElement(By.id("foo"));    
        	    }
        	});
	}

}
