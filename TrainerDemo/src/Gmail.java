import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver(chromeOptions);
 		//driver.manage().window().maximize();
	    driver.get("https://accounts.google.com/SignUp");
	    driver.findElement(By.id("FirstName")).sendKeys("Geetha");
	    driver.findElement(By.id("LastName")).sendKeys("Chockalingam");
	    driver.findElement(By.id("GmailAddress")).sendKeys("ratezz405@gmail.com");
	    driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("kumar@1234");
	    driver.findElement(By.name("PasswdAgain")).sendKeys("kumar@1234");
	    driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).sendKeys("September");
	    driver.findElement(By.xpath(".//*[@id='BirthDay']")).sendKeys("10");
	    driver.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys("1985");
	    driver.findElement(By.xpath(".//*[@id='Gender']/div")).sendKeys("Female");
	    driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("4806781866");
	    driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("geethachock@gmail.com");
	    //driver.findElement(By.id(":i")).sendKeys("United states");
	    driver.findElement(By.name("submitbutton")).click();
	    
	}

}
