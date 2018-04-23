import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/htmlT/htmlradio.php");
		WebElement radio = driver.findElement(By.xpath("//div[@class='display'][2]"));
	    List <WebElement>radio1 = radio.findElements(By.tagName("input"));
	    System.out.println(radio1.size());
        driver.close();
        
		

	}

}
