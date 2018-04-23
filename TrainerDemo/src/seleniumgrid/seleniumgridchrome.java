package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class seleniumgridchrome {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		//when you are using the grid start the role hub and node
	String Node = "http://192.168.1.10:5555/wd/hub";
	DesiredCapabilities cap = DesiredCapabilities.chrome();
	//cap.setBrowserName("chrome");
	//cap.setPlatform(Platform.WIN10);
	//chrome doesn't get maximized some version issues it is not working properly with grid.
	driver = new RemoteWebDriver(new URL(Node), cap);
	driver.get("https://login.yahoo.com/");
	System.out.println(driver.getTitle());
	driver.findElement(By.id("createacc")).click();
    driver.findElement(By.id("usernamereg-firstName")).sendKeys("Geetha");
    driver.findElement(By.id("usernamereg-lastName")).sendKeys("Chockalingam");
    driver.close();
    driver.close();

	}

}
