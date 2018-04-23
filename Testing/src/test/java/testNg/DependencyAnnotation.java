package testNg;

import java.io.IOException;

import org.testng.annotations.Test;

public class DependencyAnnotation extends Testbase {

	@Test
	public  void openingBrowser() throws IOException
	{
		login();
		System.out.println("open the browser");
	}
	@Test(dependsOnMethods={"openingBrowser"})
	public  void flightbooking()
	{
		System.out.println("book your flight");
	}
}
