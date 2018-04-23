package seleniumrealtimepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplecheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
 		driver.get("http://suvian.in/selenium/1.6checkbox.html");
 		driver.findElement(By.xpath(".//*[@id='1']")).click();
 		driver.findElement(By.xpath(".//*[@id='2']")).click();
 		
	}

}
