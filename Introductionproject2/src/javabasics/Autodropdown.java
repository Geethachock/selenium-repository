package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autodropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
	 		driver.get("https://fantasycricket.dream11.com/in/");
	 		//explicitwait declare webdriverwait
	 		WebDriverWait wd = new WebDriverWait(driver,5);
	 		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("as");
	 		//explicitwait withcondition
	 		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));
	 		driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[2]/p")).click();
	 				
	 		
	}

}
