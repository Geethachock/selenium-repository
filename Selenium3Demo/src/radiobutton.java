import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
        driver.manage().window().maximize();
      List<WebElement> option = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
      //enhanced for loop
        for(WebElement listvalue : option)
        {
        	String menu = listvalue.getAttribute("value");
        	//print and click only if it is python
        	if(menu.contentEquals("PYTHON"))
        	{
        	System.out.println("The menu is"+ menu);
            listvalue.click();
        	break;
        	}
        }
        
        //traditional for loop
      /*for(int i=0;i<=option.size();i++)
      {
    	  WebElement listvalue = option.get(i);
    	  String menu = listvalue.getAttribute("value");
    	  System.out.println("The menu is"+ menu);
    	  
    	  
      }*/

	}

}
