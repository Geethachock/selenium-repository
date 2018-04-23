package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	By email = By.xpath(".//*[@id='user_email']");
	By password = By.id("user_password");
	By submit = By.xpath("//input[@value='Log In']");
	
	
	
	public WebElement emailmethod()
	{
		return driver.findElement(email);
		
	}
	public WebElement passwordmethod()
	{
		return driver.findElement(password);
		
	}
	public WebElement submitdmethod()
	{
		return driver.findElement(submit);
		
	}

}

