/*you createobject repository to store all objects in a page and store methods and call in another class say in your
 * testcase class. If you want to change objects in future you can change just once in object repository and not inall 
 * the testcases
 */

package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffhomepage {

	
		// TODO Auto-generated method stub
	WebDriver driver;
	//constructor here is to tell to this class take the argument driver where you got to do it for chrome.
	//this.driver = driver means pointing the current class object driver to loginapplication class driver
	public Rediffhomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	By search = By.id("srchword");
	By submit = By.xpath("//input[@value='Search']");
	public WebElement searchmethod()
	{
		return driver.findElement(search);
	}
	public WebElement submitmethod()
	{
		return driver.findElement(submit);
	}
	

	

}
