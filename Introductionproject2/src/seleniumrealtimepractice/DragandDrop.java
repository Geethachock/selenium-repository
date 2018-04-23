package seleniumrealtimepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/3.2dragAndDrop.html");
 		driver.findElement(By.xpath(".//*[@id='drag1']")).click();
 		Actions builder = new Actions(driver);
 		WebElement source = driver.findElement(By.id("drag1"));
 		WebElement target = driver.findElement(By.id("div1"));
 		Action dragAndDrop = builder.clickAndHold(source)
  			   .moveToElement(target)
  			   .release(target)
  			   .build();
  		dragAndDrop.perform();
	}

}
