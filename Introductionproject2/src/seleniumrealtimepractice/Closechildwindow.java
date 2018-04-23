package seleniumrealtimepractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closechildwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/2.2browserPopUp.html");
 		driver.findElement(By.cssSelector(".btn.btn-warning")).click();
 		Thread.sleep(3000);
 		Set<String>id = driver.getWindowHandles();
		Iterator<String>it = id.iterator();
		String parentid = it.next();
		String childid = it.next();		
		driver.switchTo().window(childid);
		driver.close();
		}

}
