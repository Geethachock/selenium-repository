package seleniumrealtimepractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pastebodyofemail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://mg.mail.yahoo.com/neo/launch?.rand=c4n3gbf22djbl");
 		driver.findElement(By.id("login-username")).sendKeys("mail2geethz");
 		driver.findElement(By.id("login-signin")).click();
 		System.out.println(driver.getTitle());
 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		//Thread.sleep(5000);
 	    System.out.println(driver.getTitle());
 		driver.findElement(By.xpath(".//*[@id='login-passwd']")).sendKeys("kumar@123");
 		driver.findElement(By.id("login-signin")).click();
 		//this didn't work from here
 		Thread.sleep(10000);

 		((Object) driver).executeScript("window.confirm = function(message){return true;};");
 		driver.findElement(By.id("yui_3_16_0_ym19_1_1505258433043_482-0")).click();
 		//driver.close();
 		

	}

}
