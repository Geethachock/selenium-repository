package annatations;

import org.testng.annotations.AfterClass;

public class Aftertstannot extends Aftermethod {
	@AfterClass
	   public void close()
	   {
		   driver.close();
	   }
}
