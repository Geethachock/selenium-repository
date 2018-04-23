package annatations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testmethods extends Beforemethod {
	@Test(priority=1)
	public void link() throws InterruptedException
	{
		driver.findElement(By.id("iNav_Cards")).click();
		WebElement link = driver.findElement(By.xpath(".//*[@id='iNav_secPanel2']/div"));
		List <WebElement> link1 = link.findElements(By.tagName("a"));
		System.out.println(link1.size());
		for(int i=0;i<link1.size();i++)
		{
			System.out.println(link1.get(i).getText());
			Thread.sleep(2000);
		}
	}
	@Test(priority=0)
	public void Title()
	{
		System.out.println(driver.getTitle());
	}
}
