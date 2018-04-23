import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://demosite.center/wordpress/wp-login.php");
        driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("demo123");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("demo website");
        driver.findElement(By.xpath("//a[@href='edit.php' and text()= 'Post']")).click();

	}

}
