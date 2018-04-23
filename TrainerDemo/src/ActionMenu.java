import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver(chromeoptions);
	    driver.get("https://jqueryui.com/");
	    ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	    driver.findElement(By.linkText("Menu")).click();
	    driver.switchTo().frame(0);
	   WebElement move1 =  driver.findElement(By.id("ui-id-9"));
	  // WebElement move2 =  driver.findElement(By.id("ui-id-10"));
	  // WebElement move3 =  driver.findElement(By.id("ui-id-13"));
	   /*Actions action=new Actions(driver);
	   action.moveToElement(move1).moveToElement(move2).build().perform();*/
      //The actions in comment is not working.
	   Actions action = new Actions(driver);
	   action.moveToElement(move1).build().perform();
	   driver.findElement(By.id("ui-id-10")).click();
	   driver.findElement(By.id("ui-id-13")).click();
	   //driver.close();
	   
	   
	   
	}

}
