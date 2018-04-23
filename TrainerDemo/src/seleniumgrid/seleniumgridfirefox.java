package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class seleniumgridfirefox {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		//when you are using the grid start the role hub and node
	String Node = "http://192.168.1.10:5555/wd/hub";
	DesiredCapabilities cap = DesiredCapabilities.firefox();
	//cap.setBrowserName("firefox");
	//cap.setPlatform(Platform.WIN10);
	driver = new RemoteWebDriver(new URL(Node), cap);
	driver.manage().window().maximize();
    driver.get("https://login.yahoo.com/");
    System.out.println(driver.getTitle());
    driver.findElement(By.id("createacc")).click();
    driver.findElement(By.id("usernamereg-firstName")).sendKeys("Geetha");
    driver.findElement(By.id("usernamereg-lastName")).sendKeys("Chockalingam");
    driver.close();

	}

}
