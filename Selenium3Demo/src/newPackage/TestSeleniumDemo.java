package newPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestSeleniumDemo {
	Properties prop;
	@Test
	public  TestSeleniumDemo() 
	{
		try
		{
		File src = new File("./Configuration/congig");
		FileInputStream fis = new FileInputStream(src);
		prop = new Properties();
		prop.load(fis);
		}
		 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("the msg"+e.getMessage());
		}
		
		//String chromepath = prop.getProperty("ChromeDriver");
		//System.out.println("The chrome path is"+ chromepath);
		//return chromepath;
	}
	public String chrome()
	{
		String chromepath = prop.getProperty("ChromeDriver");
		//System.out.println("The chrome path is"+ chromepath);
		return chromepath;
		
		
	}

}
