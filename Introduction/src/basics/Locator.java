package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Locator {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mail2geethz");
		driver.findElement(By.name("pass")).sendKeys("pass1");
		
		driver.findElement(By.linkText("forgot account?")).click();
	}
}
