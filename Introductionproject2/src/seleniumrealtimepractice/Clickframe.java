package seleniumrealtimepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/2.3frame.html");
 		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe")));
 		driver.findElement(By.xpath("html/body/h3/button")).click();
 		driver.switchTo().alert().accept();
	}

}
