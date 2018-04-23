package assertiondemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
    @Test
    //oftassert will continue the program though it fails in the middle
	public void soft()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test started");
		assertion.assertEquals(11, 12);
		System.out.println("Test completed");
		
	}
    @Test
    //hard Assert will terminate the program once it fails
	public void hardAssert()
	{
		
		System.out.println("Test started");
		Assert.assertEquals(11, 12);
		System.out.println("Test completed");
		
	}
}
