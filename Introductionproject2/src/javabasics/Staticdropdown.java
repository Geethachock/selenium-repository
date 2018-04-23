package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
 		driver.get("http://spicejet.com/");
 		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
 		s.selectByValue("2");
 		s.selectByIndex(6);
 		s.selectByVisibleText("2 Adults");
 		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
 		driver.findElement(By.xpath("//a[@value='GOI']")).click();
 		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
 		driver.findElement(By.cssSelector("a[value='AMD']")).click();
 		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
 		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());

	}

}
