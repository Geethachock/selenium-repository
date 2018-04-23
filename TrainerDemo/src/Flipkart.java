import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://www.flipkart.com/");
 		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
 		driver.findElement(By.name("q")).sendKeys("Books");
 		driver.findElement(By.xpath("//div[@class='col-1-12']//button")).click();
 		driver.navigate().back();
 		//getting all the element in a location and printing it
 		WebElement tab = driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div[1]/div"));
 	    List <WebElement> tab1 = tab.findElements(By.tagName("a"));
 	    System.out.println(tab1.size());
 	    for(int i=0; i<tab1.size();i++)
 	    {
 	    	System.out.println(tab1.get(i).getText());	
 	    }
 	    
 	   
 		driver.close();
	}
	
}
