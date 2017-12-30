package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//talks about all the annotations
public class Annotation2 {
  @BeforeTest
  public  void printme()
  {
	  System.out.println("always prints before testcase starts");
  }
 @AfterTest
  public  void printme1()
  {
	  System.out.println("always prints after all the testcases");
  }
 @BeforeMethod
 public  void printme2()
 {
	  System.out.println("always prints before each testcase starts");
 }
 @AfterMethod
 public  void printme3()
 {
	  System.out.println("always prints after each testcases");
 }
	@Test
	public  void easyprint()
	{
		System.out.println("print me");
	}
	@Test
	public  void easy1print()
	{
		System.out.println("print me only");
	}
	
}
