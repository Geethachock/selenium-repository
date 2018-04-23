package rerunfailedtest;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utility.screenshotreusecode;

public class capturefailedtestcase {
	public WebDriver driver;
    @Test
	public void Test1() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    //screenshotreusecode is a method in utility package of this project
	    screenshotreusecode.capturescreenshot(driver,"Browserstarted");
	    driver.findElement(By.id("email1")).sendKeys("mail2geethz");
    }
    @AfterMethod
    public void capturefailure(ITestResult result) throws IOException
    {   //if it is failure ITestresult.failure will have the value and after getting result.getstatus value it will compare
    	System.out.println(result.getStatus());
    	if(ITestResult.FAILURE==result.getStatus())
    	{   //result.getname will have classname
    		screenshotreusecode.capturescreenshot(driver,result.getName());
    	}
	   
	    driver.close();
	 		
	}

}
