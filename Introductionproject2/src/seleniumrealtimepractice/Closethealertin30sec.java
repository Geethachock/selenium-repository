package seleniumrealtimepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closethealertin30sec {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/2.7waitUntil.html#");
 		driver.findElement(By.linkText("Click Me")).click();
 		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		Thread.sleep(30000);
 		driver.switchTo().alert().accept();
 		
	}

}
