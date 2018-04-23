package Mavenproject.Acadamey;

import java.io.IOException;

//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LandingPage;
import pageobject.Login;

public class HomePage extends Base {
	@BeforeTest
	public void openmethod() throws IOException
	{
		driver = intializedriver();
	}
	
  @Test(dataProvider="getData")
	public void basePageNavigation( String username, String Password ) 
	{  
		driver.get(urlname);
		LandingPage lp = new LandingPage(driver);
		/*Assert.assertEquals(lp.gettitlemethod().getText(),"FEATURED COURSES" );
		System.out.println(lp.gettitlemethod().getText());*/
		lp.loginmethod().click();
		Login lg = new Login(driver);
		lg.emailmethod().sendKeys(username);
		lg.passwordmethod().sendKeys(Password);
		lg.submitdmethod().click();
		
    	}
  @AfterTest()
  public void closemethod()
  {
	  driver.close(); 
  }
     @DataProvider
   
	   public Object[][] getData()
	   {
		   Object[][] data = new Object[3][2];
		   data[0][0]="geetha";
		   data[0][1]="123";
		   data[1][0]="eetha";
		   data[1][1]="12";	
		   data[2][0]="etha";
		   data[2][1]="1234";
		   return data;
	   }
   
   

}
