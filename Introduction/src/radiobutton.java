import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
	    driver.get("http://www.echoecho.com/htmlforms10.htm");
	    //driver.findElement(By.xpath("//input[@value='Milk']")).click();
	    int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
	    for(int i=0;i<count;i++)
	    {
	    	String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
	    	if(text.equals("cheese"))
	    	{
	    		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
	    	}
	    }
	}

}
