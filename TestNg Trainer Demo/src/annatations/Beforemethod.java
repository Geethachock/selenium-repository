package annatations;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class Beforemethod extends BeforeTestannot
{
@BeforeMethod
public void evaluate()
{
	System.out.println("to print before each method");
}
}
