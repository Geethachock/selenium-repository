import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//drop downs are not getting selected in firefox but works in IE
		driver.get("https://www.facebook.com/");
		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
	    dropdown.selectByIndex(6);

        /*driver.get("http://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.switchTo().alert().dismiss();
        Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
	    dropdown.selectByIndex(6);*/
	}
	}


