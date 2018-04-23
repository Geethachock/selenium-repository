
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsMenuAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver(chromeoptions);
	    driver.get("https://www.amazon.com/");
	    WebElement move1 = driver.findElement(By.id("nav-shop"));
	    Actions action = new Actions(driver);
		action.moveToElement(move1).build().perform();
		driver.findElement(By.xpath("//div[@class='nav-template nav-flyout-content nav-tpl-itemList']//span[contains(text(),'Appstore for Android')]")).click();
		driver.findElement(By.xpath("//div[@class='nav-panel']//a[2]//span[contains(text(),'Games')]")).click();
		
	}
}
