import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MultipleWindowHandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp?hl=en");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Learn more")).click();
		Thread.sleep(3000);
		//String parentwindow = driver.getWindowHandle();
		Set <String> parentwindow =  driver.getWindowHandles();
		Iterator <String> I1 = parentwindow.iterator();
		String p1 = I1.next();
		String c1 = I1.next();
		driver.switchTo().window(c1);
		System.out.println(driver.getTitle());
		driver.switchTo().window(p1);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.linkText("Learn more")).isDisplayed());
		driver.close();
		//driver.findElement(By.linkText("Edit your Google Account info")).click();
        
		
	}

}

