import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTrail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement Women = driver.findElement(By.xpath("//a[@class='_1QZ6fC' and @title='Women']"));
		WebElement Women1 = driver.findElement(By.xpath("//a[@class='_3ZgIXy' and @title='Kurtas & Kurtis']"));
		Actions act = new Actions(driver);
		act.moveToElement(Women).moveToElement(Women1).build().perform();
		driver.close();
	}

}
