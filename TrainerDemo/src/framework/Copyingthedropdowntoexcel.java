package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Copyingthedropdowntoexcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("D://Geetha//qa training//dropdown.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheet("sheet1");
		/*ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);*/
        WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop = driver.findElement(By.name("country"));
		List <WebElement> drop1 = drop.findElements(By.tagName("option"));
		for(int i=0; i<drop1.size();i++)
		{
			Row r = ws.createRow(i);
			r.createCell(0).setCellValue(drop1.get(i).getText());
			drop1.get(i).click();
			if(drop1.get(i).isSelected())
			{
				r.createCell(1).setCellValue("passed");
			}
			else
			{
				r.createCell(1).setCellValue("failed");
			}
		}
		driver.close();
		FileOutputStream f1 = new FileOutputStream("D://Geetha//qa training//dropdown.xlsx");
		wb.write(f1);
        f1.close();

		

	}

	

}
