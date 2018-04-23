import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mousehoveronaelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
       WebElement ele = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
       Actions ae = new Actions(driver);
       ae.moveToElement(ele).perform();
       List <WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
       
       for(int i=0; i<links.size(); i++)
       {
    	 WebElement element = links.get(i);
    	 String text = element.getAttribute("innerHTML");
    	 System.out.println("The elements are" + text) ; 
         if(text.equalsIgnoreCase("Appium"))
         {
        	 element.click();
        	 break;
         }
	}

}
}

