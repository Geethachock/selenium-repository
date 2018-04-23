package seleniumrealtimepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copypastechrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/1.9copyAndPasteTextAdvanced.html");
 		
 		String message = driver.findElement(By.xpath("//div[@class='intro-message']//h3[1]")).getText();
 		System.out.println(message);
 		driver.findElement(By.xpath(".//*[@id='copyandpasteadvanced']")).clear();
 		String actual = message.substring(36, 55);
 		driver.findElement(By.xpath(".//*[@id='copyandpasteadvanced']")).sendKeys(actual);
	}

}