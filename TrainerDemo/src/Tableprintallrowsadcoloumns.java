import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tableprintallrowsadcoloumns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//To print all the elements in the table	
 ChromeOptions chromeoption = new ChromeOptions();
 chromeoption.addArguments("--start-maximized");
 System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe" );
 WebDriver driver = new ChromeDriver(chromeoption);
 driver.get("https://www.timeanddate.com/worldclock/");
 Thread.sleep(2000);
 String a="/html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
 String b="]/td[";
 String c="]";
 for(int i=1;i<=35;i++)
 {
 	for(int j=1;j<=7;j++)
 	{
	 String d = driver.findElement(By.xpath(a+i+b+j+c)).getText();
	 System.out.println(d);
    }
 }
 
	}

}
