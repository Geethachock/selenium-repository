
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ajax {
      static boolean set;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    driver.findElementById("lst-ib").sendKeys("selenium ");
	    Thread.sleep(2000);
	    WebElement value = driver.findElementByXPath("//ul[@class='sbsb_b']");
	    List<WebElement> values = value.findElements(By.tagName("li"));
	    System.out.println(values.size());
	  
	  for(int i=0;i<values.size();i++)
	  {	  
		   set = false;
	   if(values.get(i).getText().equalsIgnoreCase("selenium webdriver"))
	   {
		   driver.findElementById("lst-ib").clear(); 
		   driver.findElementById("lst-ib").sendKeys("selenium webdriver"); 
		   set = true;
		   System.out.println("The text found");
		   break;
	   }
	  
	  }
	  if(set==false)
	  {
	  System.out.println(set);
	  System.out.println("The text not found");
	  }
	   
	   
	  
	    
	   
	}

}
