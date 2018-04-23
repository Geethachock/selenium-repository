import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class spicejetInternetexplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
	    dropdown.selectByIndex(6);

		/*driver.get("http://www.spicejet.com/");
		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
	    dropdown.selectByIndex(6);*/
	}

}
