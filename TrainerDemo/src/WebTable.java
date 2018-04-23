import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This table print only for 5th coloumn until 9 rows
 ChromeOptions chromeoption = new ChromeOptions();
 chromeoption.addArguments("--start-maximized");
 System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe" );
 WebDriver driver = new ChromeDriver(chromeoption);
 driver.get("https://www.timeanddate.com/worldclock/");
 String a = "/html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
 String b = "]/td[5]";
 for(int i=1;i<=9;i++)
 {
	 String c = driver.findElement(By.xpath(a+i+b)).getText();
	 System.out.println(c);
 }
 driver.close();
	}

}
