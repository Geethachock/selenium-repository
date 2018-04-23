import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoforMaximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ChromeOptions options = new ChromeOptions();
	    options.addArguments("start-maximized");
	    System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("mail2geethz");

	}

}
