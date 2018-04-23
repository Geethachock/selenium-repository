package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	
  @BeforeTest
  public void navigate() {
	   driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com/");
	    	
  }
  @BeforeMethod
  public void setup()
  {
	  System.out.println("It would be printed before each and every method");
  }
  @Test(priority=1)
  public void Title() {
	   String t = driver.getTitle();
		System.out.println(t);
  }
  @Test(priority=2)
  public void links()
  {
	  WebElement link  = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
	    List <WebElement>links= link.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
		System.out.println(links.get(i).getText());
		links.get(i).click();
		driver.navigate().back();
		link  = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
	    links= link.findElements(By.tagName("a"));
		
		
		}
     }
  @AfterMethod
  public void end()
  {
	  System.out.println("It would be printed after each and every method");
  }
  @AfterTest
  public void endthesite() 
  {   
	 driver.close(); 
  }
  
  }
  

