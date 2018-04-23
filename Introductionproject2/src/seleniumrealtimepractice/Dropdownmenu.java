package seleniumrealtimepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/1.10selectElementFromDD.html");
 		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
 		driver.findElement(By.xpath(".//*[@id='myDropdown']/a[2]")).click();
	}

}
