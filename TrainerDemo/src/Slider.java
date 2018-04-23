//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[8]/a")).click();
		WebElement hover = driver.findElement(By.xpath("//a[@title='Electronics']"));
		WebElement mobile = driver.findElement(By.xpath("//a[@href='/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles']"));
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		Thread.sleep(2000);
		action.moveToElement(mobile).click().build().perform();
		Thread.sleep(3000); ;
		WebElement slider = driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[2]/div/div/div[2]/section/div[3]/div[1]"));
		int y = slider.getLocation().x;
		action.dragAndDropBy(slider,y,200).build().perform();
		//driver.close();

	}

}
