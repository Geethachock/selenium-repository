package seleniumrealtimepractice;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbuttonenabledthenclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/2.8progressBar.html");
 		driver.findElement(By.cssSelector(".w3-btn.w3-dark-grey")).click();
 		Thread.sleep(30000);
 		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
 		Boolean value = driver.findElement(By.cssSelector("#button2")).isEnabled();
 		System.out.println(value);
 		if(value==true)
 		{
 			driver.findElement(By.cssSelector("#button2")).click();
 		}
 		driver.switchTo().alert().dismiss();
 		
 		

	}

}
