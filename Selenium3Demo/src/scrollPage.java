import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrollPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        driver.close();
	}

}
