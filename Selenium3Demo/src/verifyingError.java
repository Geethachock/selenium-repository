import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyingError {
    @Test
	public void Mytest() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='next']")).click();
        Thread.sleep(2000);
       String str1 = driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']")).getText();
       System.out.println(str1);
       Assert.assertEquals(str1,"Please enter your email.");
       System.out.println("test completed");
      
	}
	
}
