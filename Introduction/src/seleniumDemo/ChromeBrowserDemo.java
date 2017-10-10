package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeBrowserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("mail2geethz");
		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
	    dropdown.selectByIndex(6);
	    WebElement Selectedvalue =  dropdown.getFirstSelectedOption();
	    System.out.println("print"+ Selectedvalue.getText());
	   List<WebElement> Selectedlist = dropdown.getOptions();
	    int totalmonth= Selectedlist.size();
	   System.out.println("the totalmonth is"+totalmonth);
	    for(WebElement ele:Selectedlist)
	    {
	    	System.out.println("each month is "+ele.getText());
	    }
	    
	    
	   /* using for loop the above concept
	    List<WebElement> Selectedlist = dropdown.getOptions();
	    for(int i=0;i<Selectedlist.size();i++)
	    {
	    	WebElement element = Selectedlist.get(i);
	    	String value = element.getText();
	    	System.out.println("each month is"+ value);
	    	
	    }*/
	  
	   	    
	}

}
