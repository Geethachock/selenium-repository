/*you createobject repository to store all objects in a page and store methods and call in another class say in your
 * testcase class. If you want to change objects in future you can change just once in object repository and not inall 
 * the testcases
 */
//this is from normal page object model to page factory model
package objectrepository;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagefactorystyleRediffLoginpage {

	
		// TODO Auto-generated method stub
	WebDriver driver;
	//constructor here is to tell to this class take the argument driver where you got to do it for chrome.
	//this.driver = driver means pointing the current class object driver to loginapplication class driver
	public PagefactorystyleRediffLoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//By is a class that contains locator methods rather than using webelement we can use by
	@FindBy(xpath=".//*[@id='login1']")
	WebElement username;
	
	@FindBy(xpath=".//*[@name='passwd']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Go']")
	WebElement go;
	
	@FindBy(linkText="Home")
	WebElement home;
	

	
	
	
  //we define all the methods herefor objects and call it in the loginapplication class
	public WebElement emaild()
	{
		return username;
	}
	public WebElement passwordmethod()
	{
		return password;
	}
	public WebElement gomethod()
	{
		return go;
	}
	public WebElement homemethod()
	{
		return home;
	}


	

}
