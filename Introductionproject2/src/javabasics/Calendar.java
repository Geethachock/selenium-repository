package javabasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://www.path2usa.com/travel-companions");
 		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
 		List<WebElement> date =driver.findElements(By.className("day"));
 		int count = driver.findElements(By.className("day")).size();
 		for(int i=0; i<count ;i++)
 		{
 			String text = driver.findElements(By.className("day")).get(i).getText();
 			if (text.equalsIgnoreCase("23"))
 			{
 				driver.findElements(By.className("day")).get(i).click();
 				break;
 			}
 			
 		}
	}

}
