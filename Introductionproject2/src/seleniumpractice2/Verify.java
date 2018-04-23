package seleniumpractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("http://book.theautomatedtester.co.uk/");
   driver.findElement(By.linkText("Chapter1")).click();
   driver.findElement(By.id("radiobutton")).click();
  Select selectbyvalue = new Select(driver.findElement(By.id("selecttype")));
   selectbyvalue.selectByValue("Selenium RC");
   //driver.findElement(By.xpath("//input[@name='selected(1234)']")).click();
   //driver.close();
	}

}
