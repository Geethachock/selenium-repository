package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Beforeandafterclass {
	WebDriver driver;
	//before and after class is used only with single class
	@BeforeClass
	public void nav()
	{
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.americanexpress.com/");
	}
	@Test
	public void link() throws InterruptedException
	{
		driver.findElement(By.id("iNav_Cards")).click();
		WebElement link = driver.findElement(By.xpath(".//*[@id='iNav_secPanel2']/div"));
		List <WebElement> link1 = link.findElements(By.tagName("a"));
		System.out.println(link1.size());
		for(int i=0;i<=link1.size();i++)
		{
			System.out.println(link1.get(i).getText());
			Thread.sleep(3000);
		}
	}
   @AfterClass
   public void close()
   {
	   driver.close();
   }
}
