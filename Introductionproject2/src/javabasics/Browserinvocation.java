package javabasics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browserinvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
	 		driver.get("https://www.facebook.com/");
	 		driver.findElement(By.id("email")).sendKeys("mail2geethz@yahoo.com");

	}

}
