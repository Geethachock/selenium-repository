import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickonhiddenwebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
        
        /*first male radio button is hidden so it get location and when xpoint equalszero itleaves the element 
        and clicks the second element which has some value for x*/
       List<WebElement> ele = driver.findElements(By.id("male"));
       for(int i=0; i<ele.size(); i++)
       {
    	   
        WebElement element = ele.get(i);
    	 int Xpoint= element.getLocation().getX();
    	 
         if(Xpoint !=0)
         {
        	 element.click();
        	 break;
         }
	}

}
}

