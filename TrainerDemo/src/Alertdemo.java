import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alertdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver(chromeOptions);
	    driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	    driver.findElement(By.id("loginbutton")).click();
	    driver.switchTo().alert().accept();
	   WebElement table =  driver.findElement(By.xpath("//div[@class='grid_16 g_box']"));
	   List <WebElement> table1 = table.findElements(By.tagName("tr"));
	   System.out.println(table1.size());
	   for(int i=0; i<table1.size();i++)
	   {  
		   System.out.println(table1.get(i).getText());
	   }
	    driver.close();
	}

}
