
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PrintTheFirst10Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		driver.get("https://moz.com/blog/how-many-links-is-too-many");
		System.out.println(driver.getTitle());
		List <WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<=10;i++)
		{
		System.out.println(links.get(i).getText());
		}
		driver.close();
		
        
		
	}

}

