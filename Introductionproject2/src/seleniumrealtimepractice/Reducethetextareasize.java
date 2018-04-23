package seleniumrealtimepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Reducethetextareasize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/2.5resize.html");
 		Actions builder = new Actions(driver);
 		WebElement path = driver.findElement(By.xpath("//div[@class='intro-message']//h3//textarea"));
 		builder.dragAndDropBy(path, 50, 50).build().perform();
 		/*builder.moveToElement(path,100,200);
 		builder.clickAndHold();
 		builder.moveByOffset(10,25); 
 		builder.release();
 		builder.perform();*/
 		
	}

}
