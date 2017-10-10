import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		driver.get("http://www.amazon.in/");
		Actions abc=new Actions(driver);
	  WebElement element =driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"));
	    abc.moveToElement(element).build().perform();
	    WebElement xyz=driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
	    abc.click(xyz).keyDown(Keys.SHIFT).sendKeys("small").build().perform();
	}
}
