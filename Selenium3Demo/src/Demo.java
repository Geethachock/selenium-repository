import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class Demo {
		    @Test
		    public void verify()
		    {
	    	System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
	 		WebDriver driver = new ChromeDriver();
	         driver.get("http://www.ksrtc.in/oprs-web/");
	         String title = driver.getTitle();
	         Assert.assertEquals("Title is wrong", "hello", title);
	}

}
