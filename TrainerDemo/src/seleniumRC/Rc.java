package seleniumRC;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class Rc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium sell = new DefaultSelenium("localhost",4444,"firefox","http://www.tizag.com");
		sell.start();
		sell.open("/htmlT/htmlcheckboxes.php");
		sell.windowMaximize();
        sell.check("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[2]");
        sell.close();
	}

}
