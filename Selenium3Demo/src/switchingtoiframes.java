import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class switchingtoiframes {
	
	@Test	
	public void frames()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("file:///C:/Users/Geetha/Desktop/demo.html");
        int totalframe = driver.findElements(By.tagName("iframe")).size();
        System.out.println("The total number of frame is"+ totalframe);
        driver.switchTo().frame("sel");
        driver.findElement(By.xpath("//a[@title='Search W3Schools']//i")).click();
        driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("CSS");
        driver.switchTo().defaultContent();
        /*driver.findElement(By.xpath("html/body/a")).click();
        driver.switchTo().defaultContent();*/
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='sele2']"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
	}
}


