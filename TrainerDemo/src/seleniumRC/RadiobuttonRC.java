package seleniumRC;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class RadiobuttonRC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Selenium sell = new DefaultSelenium("localhost",4444,"firefox","http://www.tizag.com");
		sell.start();
		sell.open("/htmlT/htmlradio.php");
		sell.windowMaximize();
		Thread.sleep(2000);
        sell.click("name=food");
        //sell.close();
	}

}
