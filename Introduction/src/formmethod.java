import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class formmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		driver.get("https://www.makemytrip.com/");
		/*System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
		driver.findElement(By.xpath("//a[@id='multi_city_button']")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());*/
		driver.findElement(By.xpath("//span[@class='selctdate']")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[4]/a")).click();
		int i=0;
		while(i<5)
		{
		driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();
		i++;
		}

	}

}
