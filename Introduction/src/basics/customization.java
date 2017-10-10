package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class customization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username")).sendKeys("mail2geethz");
        driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("pass");
        driver.findElement(By.xpath("//input[@name='Login']")).click();
 }
}