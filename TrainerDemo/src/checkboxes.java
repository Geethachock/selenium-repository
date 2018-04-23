import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver(chromeoptions);
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		WebElement checkbox = driver.findElement(By.xpath("//td[@class='mainIn']//div[6]"));
		List <WebElement> check1 = checkbox.findElements(By.tagName("input"));
		System.out.println(check1.size());
        for(int i=0; i<4; i++)
        {
        	System.out.println(check1.get(i).getAttribute("value"));
        	System.out.println(check1.get(i).isSelected());
        }
        driver.close();
        
	}

}
