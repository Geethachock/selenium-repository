import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LinksinAmazon {
	
	public static void main(String[] args) 
	{
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver","c:\\Program Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(chromeoptions);
			driver.get("https://www.amazon.com/");
			WebElement link = driver.findElement(By.id("searchDropdownBox"));
			List <WebElement> links = link.findElements(By.tagName("option"));
			System.out.println(links.size());
			for(int i=0;i<links.size();i++)
			{
			System.out.println(links.get(i).getText());
			
			}
			driver.close();
			
	}
}
