import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\Geetha\\Downloads\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		driver.get("http://www.ebay.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement footer1 = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(footer1.findElements(By.tagName("a")).size());
		String beforeclicking=null;
		String afterclicking;
		for(int i=0;i<footer1.findElements(By.tagName("a")).size();i++)

		{
			//System.out.println(footer1.findElements(By.tagName("a")).get(i).getText());
			if(footer1.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
				{beforeclicking = driver.getTitle();
			
				footer1.findElements(By.tagName("a")).get(i).click();
				break;
				}
								
		}
		afterclicking = driver.getTitle();
		if(beforeclicking == afterclicking)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
