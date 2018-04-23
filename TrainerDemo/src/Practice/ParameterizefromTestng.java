package Practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizefromTestng {
	@Test
	@Parameters("Browser")
	//you can give the browser value fro testng
	public void parametertest(String Browser)
	{
		if(Browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println("It is a firefox browser");
		}
		else if(Browser.equalsIgnoreCase("chrome"))
			{
				System.out.println("It is a chrome browser");
			}
		else if(Browser.equalsIgnoreCase("internet explorer"))
		{
			System.out.println("It is a IE browser");
		}
		else
		{
			System.out.println("No browser found");
		}
	}
	

}
