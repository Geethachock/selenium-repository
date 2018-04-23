package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassslider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
		  driver.get("http://jqueryui.com/resources/demos/slider/default.html"); 
		  Thread.sleep(5000);
		  WebElement slider = driver.findElement(By.id("slider")); 

		  Actions action = new Actions(driver);

		  

		  action.dragAndDropBy(slider, 90, 0).perform(); 

	}

}
