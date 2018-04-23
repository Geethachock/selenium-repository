package javabasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

 		driver.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
 		driver.findElement(By.id("FH-origin")).sendKeys("NYC");
 		driver.findElement(By.id("FH-origin")).sendKeys(Keys.ENTER);
 		driver.findElement(By.xpath("//select[@name='DestName']")).click();
 		driver.findElement(By.xpath("//option[@value='Oahu']")).click();
 	    driver.findElement(By.id("FH-fromDate")).click();
 	    driver.findElement(By.xpath("//button[@data-day='30' and @data-month='7']")).click();
 	   driver.findElement(By.xpath("//button[@data-day='6']")).click();
 	   driver.findElement(By.id("FH-searchButtonExt1")).click();
 	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	   /*WebDriverWait d = new WebDriverWait(driver,5);
 	   d.until(ExpectedConditions.visibilityOfElementLocated())*/

	}

}
