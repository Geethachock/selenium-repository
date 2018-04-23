package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By login = By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in']");
	By title = By.xpath("//h2[text()='Featured Courses']");
	By navbar = By.cssSelector(".nav.navbar-nav.navbar-right");
	
	public WebElement loginmethod()
	{
		return driver.findElement(login);
		
	}
	public WebElement gettitlemethod()
	{
		return driver.findElement(title);
		
	}
	public WebElement navbarmethod()
	{
		return driver.findElement(navbar);
		
	}


}

