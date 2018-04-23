import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
	 		WebDriver driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	         driver.get("https://www.redbus.in/");
	         driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
	         //get all the values in the table 
	         List<WebElement> dates = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']//table//td"));
	         int total = dates.size();
	         //use a for loop and click on 31
	         for(int i=0;i<total;i++)
	         {
	        	String date = dates.get(i).getText();
	        	if(date.equals("31"))
	        	{
	        		dates.get(i).click();
	        		break;
	        	}
	         }
	}

}
