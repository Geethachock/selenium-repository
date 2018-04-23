package assertiondemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions {
    @Test
	public void Test1()
	{
      Assert.assertEquals(12, 13);
	}
    @Test
    public void Test2()
	{
      Assert.assertEquals(12, 13,"It cannot find the value");
	}
    @Test
    public void Test3()
    {
    	String str="Mukesh";
    	Assert.assertTrue(str.contains("sachin"), "It does match with the value");
    }
    @Test
    public void Test4()
    //verifying the title of the page
    {
    	System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.software-testing-tutorials-automation.com/2014/03/assertassertequals-testng-with-selenium.html");
        String str1 = driver.getTitle();
        Assert.assertEquals("Assert.assertEquals TestNG With Selenium WebDriver Example",str1);

    }
}
