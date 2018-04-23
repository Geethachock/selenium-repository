package seleniumrealtimepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countthechapters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/2.6liCount.html");
 		int count = driver.findElements(By.xpath(".//*[@id='books']//li//ul//li[contains( text(),'Chapter' )]")).size();
 		System.out.println(count);
 		driver.findElement(By.xpath(".//*[@id='chapall']")).sendKeys(String.valueOf(count));
 		int count1 = driver.findElements(By.xpath(".//*[@id='books']//li[2]//ul//li[contains(text(), 'Chapter')]")).size();
 		driver.findElement(By.xpath(".//*[@id='chapbook2']")).sendKeys(String.valueOf(count1));
 		
	}

}
