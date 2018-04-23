import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Aboutwaits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new FirefoxDriver();
      driver.get("https://www.flipkart.com/");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
      Thread.sleep(2000);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/50/50/image/6f42a4.jpg?q=50']")).click();		  
      
     	/* explicitwait and fluent wait look atguru99*/	  
	}

}
