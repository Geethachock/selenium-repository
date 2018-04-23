package javabasics;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowserinvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver//geckodrivernew.exe");
		WebDriver driver = new FirefoxDriver();
 		driver.get("https://www.facebook.com/");
 		System.out.println(driver.getTitle());
 		//System.out.println(driver.getPageSource());
 		System.out.println(driver.getCurrentUrl());
 		driver.close();
	}

}
