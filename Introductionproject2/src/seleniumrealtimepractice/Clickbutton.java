package seleniumrealtimepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Clickbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
 		driver.get("http://suvian.in/selenium/1.1link.html");
 		driver.findElement(By.linkText("Home")).click();

	}

}
