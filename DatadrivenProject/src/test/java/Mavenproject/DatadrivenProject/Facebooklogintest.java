package Mavenproject.DatadrivenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogintest {
    public WebDriver driver;
    public XSSFCell cell;
    @Parameters("Browser")
    @BeforeTest
    public void openbrowser(String Browser)
    {
    	if(Browser.equalsIgnoreCase("firefox"))
    	{
    		driver = new FirefoxDriver();
    		driver.manage().window().maximize();
    	}
    	else if(Browser.equalsIgnoreCase("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.manage().window().maximize();
    	}
    	driver.get("https://www.facebook.com/");
    }
	@Test
	public void login() throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("C://Users//Geetha//workspace//DatadrivenProject//src//main//java//resources//datafordatadrivenmavenproject.xlsx");
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet ws = wb.getSheet("sheet1");
	    for(int i=1;i<=ws.getLastRowNum();i++)
	    {
	    	cell=ws.getRow(i).getCell(0);
	    	cell.setCellType(cell.CELL_TYPE_STRING);
	    	//import data for email
	    	driver.findElement(By.xpath("//input[@type='email'][@name='email']")).clear();
			driver.findElement(By.xpath("//input[@type='email'][@name='email']")).sendKeys(cell.getStringCellValue());	    
	        //import for password
			cell=ws.getRow(i).getCell(1);
			cell.setCellType(cell.CELL_TYPE_STRING);
			driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).clear();
			driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).sendKeys(cell.getStringCellValue());	    
			// To click on Login button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit'][@id='u_0_2']")).click();
			// To click on Account settings dropdown	
			driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
			// To click on logout button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//text()[.='Log Out']/ancestor::span[1]")).click();
			
		 }
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	
}
