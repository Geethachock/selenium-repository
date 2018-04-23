package framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class storethelinksandverifyinexcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//to clickon each link mentioned in the excelsheet and to check the actual url with the expected url
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		FileInputStream f = new FileInputStream("D://Geetha//qa training//links.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheet("sheet1");
		int rownum = ws.getLastRowNum();
		for(int i=1;i<=rownum ;i++)
		{
			Row r = ws.getRow(i);
			String link = r.getCell(0).getStringCellValue();
			try
			{   
				driver.findElement(By.linkText(link)).click();
				String actualurl = driver.getCurrentUrl();
				r.createCell(2).setCellValue(actualurl);
				String Expecturl = r.getCell(1).getStringCellValue();
				if(actualurl.equalsIgnoreCase(Expecturl))
				{
					r.createCell(3).setCellValue("passed");
				}
				else
				{
					r.createCell(3).setCellValue("Failed");
				}
				driver.navigate().back();

			}
			catch(Exception e)
			{
				r.createCell(3).setCellValue("Link not found");
			}
			FileOutputStream f1 = new FileOutputStream("D://Geetha//qa training//links.xlsx");
			wb.write(f1);
			
			
		}
		driver.close();
	}
}
