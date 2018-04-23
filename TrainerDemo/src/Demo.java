import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.com/");
	    driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ManualTesting");
        driver.close();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver1 = new ChromeDriver(chromeOptions);
	    driver1.get("https://www.amazon.com/");
	    driver1.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	    driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("ManualTesting");
        driver1.close();
        System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver2 = new InternetExplorerDriver(capabilities);
		driver2.get("https://www.amazon.com/");
	    driver2.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	    driver2.findElement(By.id("twotabsearchtextbox")).sendKeys("ManualTesting");
        driver2.close();
	}

}
