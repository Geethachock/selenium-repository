package javabasics;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.screenshotreusecode;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    //screenshotreusecode is a method in utility package of this project
	    screenshotreusecode.capturescreenshot(driver,"Browserstarted");
	    driver.findElement(By.id("email")).sendKeys("mail2geethz");
	    screenshotreusecode.capturescreenshot(driver,"typelogin");
	    driver.close();
	 		
	}

}
