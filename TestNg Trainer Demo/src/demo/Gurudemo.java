package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gurudemo {

	WebDriver driver ;
	@BeforeTest
	public void nav()
	{
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--Start-maximized");
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
	}
	
	@Test
	public void Title()
	{
		String u = driver.getTitle();
		System.out.println(u);
	}
	
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.name("uid")).sendKeys("mngr108115");
		driver.findElement(By.name("password")).sendKeys("tYmYtyg");
		driver.findElement(By.name("btnLogin")).click();
		
	}
	@Test
	public void MangerId() throws InterruptedException 
	{   Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'Manger Id')]")).isDisplayed(),"Manager id not displayed");
		
	   	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
}
