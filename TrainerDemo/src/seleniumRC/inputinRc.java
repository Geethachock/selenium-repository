package seleniumRC;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class inputinRc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Selenium sell = new DefaultSelenium("localhost",4444,"firefox","http://www.newtours.demoaut.com");
		sell.start();
		sell.open("/");
		sell.windowMaximize();
		Thread.sleep(2000);
		sell.click("//html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
		Thread.sleep(2000);
        sell.type("name=firstName", "peerstech");
        sell.type("name=lastName", "peerstech");
        //sell.close();
	}

}
