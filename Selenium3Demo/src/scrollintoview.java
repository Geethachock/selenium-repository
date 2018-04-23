import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrollintoview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		//here "--start-maximized" argument is responsible to maximize chrome browser
		co.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]")); 
        je.executeScript("arguments[0].scrollIntoView(true);",element);
        System.out.println(element.getText());
	}

}
