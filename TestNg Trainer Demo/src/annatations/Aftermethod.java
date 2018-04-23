package annatations;

import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;

public class Aftermethod extends Testmethods
{
@AfterMethod
public void evaluates()
{
	System.out.println("to print after each method");
}
}