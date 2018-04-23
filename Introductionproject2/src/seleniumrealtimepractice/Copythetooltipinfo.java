package seleniumrealtimepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copythetooltipinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://suvian.in/selenium/2.4mouseHover.html");
 		Actions builder = new Actions(driver);
 		WebElement tooltip = driver.findElement(By.xpath("//a[@title='This is a tooltip.']"));
 		builder.moveToElement(tooltip).perform();
 		String tooltipmsg = tooltip.getText();
 		System.out.println(tooltipmsg);
 		
	}

}
