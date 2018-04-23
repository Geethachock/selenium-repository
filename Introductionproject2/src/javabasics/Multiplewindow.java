package javabasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
		driver.findElement(By.linkText("Learn more")).click();
		System.out.println(driver.getTitle());
		
		Set<String>id = driver.getWindowHandles();
		Iterator<String>it = id.iterator();
		String parentid = it.next();
		String childid = it.next();		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		

		   
 		
	}

}
