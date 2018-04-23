/*you createobject repository to store all objects in a page and store methods and call in another class say in your
 * testcase class. If you want to change objects in future you can change just once in object repository and not inall 
 * the testcases
 */

package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	
		// TODO Auto-generated method stub
	WebDriver driver;
	//constructor here is to tell to this class take the argument driver where you got to do it for chrome.
	//this.driver = driver means pointing the current class object driver to loginapplication class driver
	public RediffLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	//By is a class that contains locator methods rather than using webelement we can use by	 
	By username = By.xpath(".//*[@id='login1']");
	By password = By.xpath(".//*[@name='passwd']");
	By go =	By.xpath("//input[@value='Go']");
	By home = By.linkText("Home");
	
  //we define all the methods herefor objects and call it in the loginapplication class
	public WebElement emaild()
	{
		return driver.findElement(username);
	}
	public WebElement passwordmethod()
	{
		return driver.findElement(password);
	}
	public WebElement gomethod()
	{
		return driver.findElement(go);
	}
	public WebElement homemethod()
	{
		return driver.findElement(home);
	}


	

}
