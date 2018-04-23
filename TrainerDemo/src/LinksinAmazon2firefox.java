import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksinAmazon2firefox {
	
	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			//driver.findElement(By.id("nav-link-shopall")).click();
			WebElement link = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]"));
			List <WebElement> links = link.findElements(By.tagName("span"));
			System.out.println(links.size());
			for(int i=0;i<links.size();i++)
			{
				System.out.println(links.get(i).getText());
			}
			//driver.close();
	}
}
