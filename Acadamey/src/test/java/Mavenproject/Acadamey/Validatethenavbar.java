package Mavenproject.Acadamey;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPage;


public class Validatethenavbar extends Base {
	@BeforeTest
	public void openmethod() throws IOException
	{
		driver = intializedriver();
	}
  @Test
	public void basePageNavigation() throws IOException  
	{ 	
	    driver.get(urlname);
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.navbarmethod().isDisplayed());	
	}
  @AfterTest()
  public void closemethod()
  {
	  driver.close(); 
  }
  
      

}
