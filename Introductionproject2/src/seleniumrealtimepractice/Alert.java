package seleniumrealtimepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/2.1alert.html");
 		driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
 		driver.switchTo().alert().accept();
	}

}
