import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoologin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://login.yahoo.com/");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.id("createacc")).click();
	    driver.findElement(By.id("usernamereg-firstName")).sendKeys("Geetha");
	    driver.findElement(By.id("usernamereg-lastName")).sendKeys("Chockalingam");
	    driver.findElement(By.id("usernamereg-yid")).sendKeys("geeraz@yahoo.com");
	    driver.findElement(By.name("password")).sendKeys("kumar");
	    driver.findElement(By.className("phone-no ")).sendKeys("4806781866");
	    driver.findElement(By.id("usernamereg-month")).sendKeys("September");
	    driver.findElement(By.id("usernamereg-day")).sendKeys("10");
	    driver.findElement(By.id("usernamereg-year")).sendKeys("1985");
	    driver.findElement(By.name("freeformGender")).sendKeys("Female");
	    driver.findElement(By.id("reg-submit-button")).click();
	    driver.close();
	}

}
