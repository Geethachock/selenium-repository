import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmailcontextclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement google = driver.findElement(By.linkText("Gmail"));
		action.contextClick(google).sendKeys("S").build().perform();
		
		

	}

}
