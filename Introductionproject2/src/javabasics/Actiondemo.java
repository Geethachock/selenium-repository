package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Actiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
 		driver.get("https://www.amazon.com/");
 	//Actions a = new Actions(driver);
 		//a.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"))).build().perform();
 		driver.findElement(By.xpath(".//*[@id='nav-link-accountList']")).click();
 		
 		}
}
