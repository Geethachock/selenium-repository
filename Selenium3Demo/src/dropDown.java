import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //clicking a drop down and printing all the list items
        driver.findElement(By.xpath(".//*[@id='menu1']")).click();
        List <WebElement> wholelist = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
      /*  for(int i=0; i<=wholelist.size();i++)
        {
        	WebElement listready = wholelist.get(i);
        	String innerhtml = listready.getText();
            if(innerhtml.contentEquals("JavaScript"))
        	{
        	  listready.click();
        	  break;
        	}
        	System.out.println("Each list item is"+ innerhtml);
        }*/
        for( WebElement listready: wholelist)
        {
        	
        	String innerhtml = listready.getText();
            if(innerhtml.contentEquals("JavaScript"))
        	{
        	  listready.click();
        	  break;
        	}
        	System.out.println("Each list item is"+ innerhtml);
        }
	}

}
