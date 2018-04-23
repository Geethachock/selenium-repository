import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollviewmyexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://learn-automation.com/");
        JavascriptExecutor je = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.xpath("//span[text()='Selenium Hybrid Framework']"));
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println(element.getText());
	}

}
