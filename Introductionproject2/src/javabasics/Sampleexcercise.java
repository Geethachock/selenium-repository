package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Sampleexcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
 		driver.get("https://www.ebay.com/");
 		System.out.println(driver.findElements(By.tagName("a")).size());
 		WebElement footer = driver.findElement(By.id("glbfooter"));
 		System.out.println(footer.findElements(By.tagName("a")).size());
 		WebElement col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
 		System.out.println(col.findElements(By.tagName("a")).size());
 		
 		for(int i=0; i<col.findElements(By.tagName("a")).size(); i++)
 		 	{
 			  if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"));
 			  {
 			 col.findElements(By.tagName("a")).get(i).click();
 			 break;
 			  }
 			 
	       }
 		System.out.println(driver.getTitle());
 		

}
}
