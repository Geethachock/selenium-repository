package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class forms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
 		driver.get("http://us.makemytrip.com/");
 		driver.findElement(By.xpath("//a[@class='date_field_tab flL make_relative left']")).click();
 		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[4]/a")).click();
 		//driver.findElement(By.xpath(".//span[@class='ui-combobox available_mark']")).click();

	}

}
